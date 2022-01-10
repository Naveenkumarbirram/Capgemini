package com.spring_Collections.spring_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config,xml.xml");
        //Object for class - order.java
        
        //Object for class - Emp.class
        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getCourses());
        System.out.println(emp.getAddresses());
        
    }
}