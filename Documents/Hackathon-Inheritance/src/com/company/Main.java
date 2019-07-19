package com.company;

public class Main {
    public static void main(String[] args)
    {
        HondaCity hondaCity=new HondaCity("ABC133",5,140,"9 lakhs" );
        System.out.println(hondaCity.toString());
        hondaCity.applyBreak(20);
        hondaCity.speedUp(30);

        hondaCity.specialFeature();

    }
}
