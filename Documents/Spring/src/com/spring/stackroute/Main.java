package com.spring.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import java.lang.*;
public class Main {
    public static void main(String[] args) {
        //try {


        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Sim obj = (Sim) context.getBean("Sim");
        obj.calling();
        obj.data();
    }
//        catch (BeansException e) {
//
//        }
//        catch (Exception e) {
//
//        }
}

