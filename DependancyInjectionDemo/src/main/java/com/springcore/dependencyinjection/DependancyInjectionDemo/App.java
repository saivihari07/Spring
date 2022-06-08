package com.springcore.dependencyinjection.DependancyInjectionDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); 
       
       Teacher t = (Teacher) context.getBean("teach");
       System.out.println(t.getName()+" "+t.getAddress()+" "+t.getTpen());
       
    }
}
