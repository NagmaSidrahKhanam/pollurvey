package com.stackroute.junitwork;

//Create class StreamDemo.Create List like-
//        memberNames.add("Amitabh");
//memberNames.add("Shekhar");
//memberNames.add("Aman");memberNames.add("ahana");
//memberNames.add("Shahrukh");
//memberNames.add("Salman");
//memberNames.add("Yana");
//memberNames.add("Lokesh");
//a)print all the names starts with A.b)
//        print all the names in uppercase.c)
//        print all the names in uppercase whose name ends with s.
//        d)count all the names ends with h.e)
//        find the first name starts with ‘S’.
//        In the same class create another list of types numbers.
//        a)print all the numbers which are even.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {


    public static void main(String[] args){
        List<String> memberNames= new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Jabis");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yanas");
        memberNames.add("Lokesh");

        Stream<String> stream = memberNames.stream();
        stream.filter( item -> item.startsWith("A")).forEach(System.out::println);
        System.out.println("\n");

        Stream<String> streamupper = memberNames.stream();
        streamupper.map( item -> item.toUpperCase()).forEach(System.out::println);
        System.out.println("\n");

        Stream<String> streamendwiths = memberNames.stream();
        streamendwiths.filter(item -> item.endsWith("s")).map(it -> it.toUpperCase()).forEach(System.out::println);
        System.out.println("\n");


        long count = memberNames.stream().filter( item -> item.endsWith("h")).count();
        System.out.println("No. of names ends with h: "+count);
        System.out.println("\n");


        Stream<String> streamstartwiths = memberNames.stream();
        streamstartwiths.filter( item -> item.startsWith("S")).forEach(System.out::println);
        System.out.println("\n");


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(value -> value % 2 == 0).forEach(System.out::println);
    }

}