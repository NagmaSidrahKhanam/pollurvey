package com.spring.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //try {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student obj = context.getBean("student",Student.class);
        obj.print();

        Student obj1 = context.getBean("student1",Student.class);
obj1.display();
    }
}
