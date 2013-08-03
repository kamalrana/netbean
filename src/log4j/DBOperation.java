/**
@author : kamal64
*/
package log4j;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DBOperation {
	static Connection c = null;
	static Statement stmt = null;
	static PreparedStatement ps=null;
         static boolean debugFlag = false;
         static boolean warnFlag = false;
         static boolean fatalFlag = false;
         static boolean errorFlag = false;
         static boolean infoFlag = false;
         static boolean traceFlag = false;
public static void main(String[] args) throws Exception {}

	public static String operation(String datePattern, String fileLocation) {
		Scanner s = null;
                String begDate ="";
                String lastDate ="";
		String dbName =Log4jFrame.databaseFile;
		boolean b = true;
		String object = "";
		String date = "";
		String level = "";
		// String dateFormat=reqDateFormat;

		try {
                    if(! new File(dbName).exists()){
//                        String str ="D:/sqlite/sqlite3.exe testDB1.db";
                        System.out.println("dbName :: "+dbName);
                        String str=dbName.substring(0,dbName.lastIndexOf("/")+1);
                        str+="sqlite3.exe "+dbName.substring(dbName.lastIndexOf("/")+1,dbName.length());
                        System.out.println("str is :: "+str);
	    Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c",str});
	    System.out.println(str);
                    }
			String sql = "insert into Test1 values(?,?,?)";
			
			s = new Scanner(new File(fileLocation));
			
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:"+dbName);
			stmt = c.createStatement();
			
			System.out.println("stmt");
			
//			 stmt.executeUpdate("drop table Test1");
//			System.out.println(tableCreationSql);
			
			stmt.executeUpdate("create table Test1 (DATE date,LEVEL text,MESSAGE blob)");
			
			stmt.executeUpdate("PRAGMA synchronous=OFF");
			
			stmt.executeUpdate("PRAGMA locking_mode=OFF");
			
			System.out.println("transaction begin");
			
			System.out.println("datePattern " + datePattern);
			
			stmt.executeUpdate("BEGIN TRANSACTION");
			
			ps = c.prepareStatement(sql);
			
			while (s.hasNextLine()) {
				object = s.nextLine().trim();
                            System.out.println("object is :: "+object);
				if (object.contains("DEBUG")) {
					level = "DEBUG";
                                        debugFlag = true;
				} else if (object.contains("INFO")) {
					level = "INFO";
                                        infoFlag = true;
				} else if (object.contains("FATAL")) {
					level = "FATAL";
                                        fatalFlag = true;
				} else if (object.contains("ERROR")) {
					level = "ERROR";
                                        errorFlag = true;
				} else if (object.contains("WARN")) {
					level = "WARN";
                                        warnFlag = true;
				} else if (object.contains("TRACE")) {
					level = "TRACE";
                                        traceFlag = true;
				}
				
				Pattern p = Pattern.compile(datePattern);
				Matcher m = p.matcher(object);
				
				date = "";
				// System.out.println("datePattern is " + m.pattern());
				while (m.find()) {
					 System.out.println(m.start() + ">>" + m.group());
					date = m.group();
					break;
				}
				if (date == "")
					continue;

				/*
				 * if(b && (f.length()/1024)/1024==200){
				 * System.out.println("transaction eneded");
				 * stmt.executeUpdate("END TRANSACTION");
				 * System.out.println("transaction begin again");
				 * stmt.executeUpdate("BEGIN TRANSACTION"); b=false; }
				 */
				// insertOperation(object,date);
				// object=object.replaceAll("[\\']", "\\\\\\'");
				// System.out.println("date>> "+date+" >>level>>"+level);
				
				ps.setString(1, date);
				ps.setString(2, level);
				ps.setString(3, object);
				ps.addBatch();
				ps.executeBatch();
				
				
			}
		} catch (Exception e) {
//			if (e.toString().contains("already exists"))
//                        {try {
//					stmt.execute("drop table Test1");
//				} catch (SQLException e1) {
//					// e1.printStackTrace();
//				}
//                        }
//                        else
			 e.printStackTrace();
                         System.exit(1);
		}

		try {
			stmt.executeUpdate("END TRANSACTION");
                        ResultSet rs=stmt.executeQuery("select date from Test1 limit 1");
                        if(rs==null)
                            System.out.println("rs is null");
                        rs.next();
                        begDate=rs.getString(1);
                        System.out.println("beg. date is "+begDate);
                        rs=null;
                       rs=stmt.executeQuery("select date from Test1 limit (select count(date) from Test1)-1,1");
                        rs.next();
                     lastDate = rs.getString(1);
                        System.out.println("end. date is "+lastDate);
			stmt.close();
			c.close();
			ps.close();
                        rs.close();
			s.close();
		} catch (Exception e) {
                    System.out.println("Exception catch ");
			e.printStackTrace();
		}
                String returnString=begDate+"#"+lastDate+"##";
                if(debugFlag)
                    returnString=returnString+"DEBUG#";
                if(errorFlag)
                    returnString=returnString+"ERROR#";
                if(infoFlag)
                    returnString=returnString+"INFO#";
                if(warnFlag)
                    returnString=returnString+"WARN#";
                if(fatalFlag)
                    returnString=returnString+"FATAL#";
                if(traceFlag)
                    returnString=returnString+"TRACE";
                return returnString;
	}
}
