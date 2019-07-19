package com.stackroute.junitwork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PlacesStream  {
    public static void main(String[]args){

        List<String> places = new ArrayList<String>();
        List<String> arr = new ArrayList<String>();


        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");

        Stream<String> stream = places.stream();
        stream.filter( item -> item.startsWith("N")).map(itm -> itm.substring(7,itm.length()-1)).forEach(System.out::println);

    }



}
