package com.livingoncodes.spring.springtutorial04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/livingoncodes/spring/springtutorial04/beans/beans.xml");
    	
    	
    	ContactBook contacts = (ContactBook) context.getBean("contactbook");
    	System.out.println(contacts);
    	
    	((ClassPathXmlApplicationContext)  context ).close();
    }
}
