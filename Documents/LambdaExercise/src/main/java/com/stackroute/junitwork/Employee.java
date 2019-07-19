package com.stackroute.junitwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Employee {

    private int age;
    private String name;
    private String lastName;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee(int age, String name, String lastName) {

        this.age=age;
        this.name=name;
        this.lastName=lastName;

    }



    public static class LambdaDemoClass{
    public static void main(String[] args){
    Employee e1 = new Employee(22,"will","william");
    Employee e2 = new Employee(23,"el","eleven");
    Employee e3 = new Employee(44,"dart","demogorgan");
    Employee e4 = new Employee(44,"dart","demogorgan");

        List<Employee> l = new ArrayList<>();

        l.add(e1);
    l.add(e2);
    l.add(e3);
    l.add(e4);

//    l.sort(Comparator.comparing(Employee::getLastName));
//        for (Employee list:l)
//              {
//                  System.out.println(list.name);
//        }
        Comparator<Employee> empnameComparatorLambda = (emp1, emp2) -> e1.getLastName().compareTo(e2.getLastName());
        Collections.sort(l, empnameComparatorLambda);

//        System.out.println();

        Stream<Employee> stream = l.stream();
        stream.forEach( element -> { System.out.println(element.getLastName()); });

    }



    }


}