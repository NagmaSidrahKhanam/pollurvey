package com.spring.stackroute;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling Vodafone");
    }

    @Override
    public void data() {
        System.out.println("Browsing in Vodafone");
    }
}
