package com.spring.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String args[])
    {
//        Student student = new Student();
//        MathCheat cheat = new MathCheat();
//        student.setMathobj(cheat);
//        student.cheating();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student obj = context.getBean("student",Student.class);
//        obj.print();
    }
}
