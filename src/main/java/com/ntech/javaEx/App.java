package com.ntech.javaEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import lombok.Data;

/**
 * Hello world!
 *
 */
@Data
public class App 
{
    public static void main( String[] args ) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        System.out.println( "Hello World!" );
        
        FileInputStream fis = new FileInputStream("src/main/java/com/ntech/javaEam/setting.txt");
        		Scanner scan = new Scanner(fis);
        String className = scan.nextLine();
        
        scan.close();
        fis.close();
        Class clazz = Class.forName(className);
        A a = new A();
        X x = (X) clazz.newInstance();
        
        System.out.println(className);
        a.setX(x);
        a.print();
        
        
    }
}
