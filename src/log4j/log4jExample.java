package log4j;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import org.apache.log4j.Logger;

public class log4jExample{
  /* Get actual class name to be printed on */
  static Logger log = Logger.getLogger( log4jExample.class.getName());
  static File file=new File("G:\\usr\\home\\log4j\\log.out");
  public static void main(String[] args)
                throws IOException,SQLException{
	  int i=0;
	  int r1=0;
	  Random r=new Random();
	  while((file.length()/1024)/1024<=200){
		  r1=r.nextInt(3);
		  getThread(r1);
		  i++;
		  if(r1==0)
     log.debug("Hello this is an debug message no. >> "+(i)+" <<< Hello this is an debug message no"+ "Hello this is an debug message no. >> "+(i)+" <<< Hello this is an debug message no");
		  if(r1==1)
     log.info("Hello this is an info message no. >> "+(i)+" <<<");
		  if(r1==2)
			  log.error("Hello this is an error message no. >> "+(i)+" <<<");
     System.out.println(i);
	  }
  }
private static void getThread(int nextInt) {
switch (nextInt) {
case 0:
	Thread.currentThread().setName("kamal");
	break;
case 1:
	Thread.currentThread().setName("kishore");
	break;
case 2:
	Thread.currentThread().setName("rana");
	break;
default:
	break;
}
	
}
}