package com.spring.stackroute;

public class Airtel implements Sim{


    @Override
    public void calling() {
        System.out.println("Calling Airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing in Airtel");
    }
}
