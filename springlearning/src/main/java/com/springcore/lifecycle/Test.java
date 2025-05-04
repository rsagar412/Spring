package com.springcore.lifecycle;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/samconfig.xml");
        Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
        context.registerShutdownHook(); // This will call the destroy method of samosa bean
    }
}
