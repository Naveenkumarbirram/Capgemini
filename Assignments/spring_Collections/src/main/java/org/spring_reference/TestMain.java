package org.spring_reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Project started");
		ApplicationContext con=new ClassPathXmlApplicationContext("config.reference.xml");
       
		A temp=(A) con.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println(temp);
        
        
	}

}
