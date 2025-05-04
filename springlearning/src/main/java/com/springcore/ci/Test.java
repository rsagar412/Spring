package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // Creating the application context
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");

        // Retrieving the Person bean from the context
        // Person person = (Person) context.getBean("add1");
        Addition addition = (Addition) context.getBean("add1");

        // Printing the details of the person
        System.out.println("Sum is: "+addition.doSum());
        
    }
}
