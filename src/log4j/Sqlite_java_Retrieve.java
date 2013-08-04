/**
@author : kamal64
*/


package log4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Sqlite_java_Retrieve {
	static boolean debugFlag = true;
    static boolean warnFlag = true;
    static boolean fatalFlag = true;
    static boolean errorFlag =  true;
    static boolean infoFlag =  true;
    static boolean traceFlag = true;
	 public static void main(String arg[]){
	        /*try {
	             Connection conn = null;  
	             Class.forName("org.sqlite.JDBC");
	            String url = "jdbc:sqlite:C:/sqlite/testDB.db";  
	            String user = "";  
	            String pwd = "";  
	            conn = DriverManager.getConnection(url, user, pwd);  
	            Statement stmt=conn.createStatement();
	            ResultSet rs=stmt.executeQuery("select date from Test1 limit (select count(date) from Test1)-1,1");
                rs.next();
                String d=rs.getString(1);
                System.out.println("beg. date is "+d.toString());
	            stmt.close();
	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }*/
		 String returnString="hlloeedvvs";
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
         
         System.out.println(returnString);
	    }
}
