/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author krana
 */
public class NoOfErrorInFile {
    public static void main(String [] arg){
        try {
            File f=new File("D:\\sqlite\\logs\\log.out");
            String object;
          Scanner  s = new Scanner(f);
          int i=0;
                while (s.hasNextLine()) {
                    object = s.nextLine().trim();
                    if (object.contains("ERROR")) {
                        System.out.println(i++);      
                    }
                    }
                System.out.println("no of errors is :: "+i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
