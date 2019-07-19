package com.stackroute.junitwork;

public class Member {
    String name;

    class MemberVariable {

        public String[] isMember(String name, int age, double salary) {
            String[] arr = {name, String.valueOf(age), String.valueOf(salary)};
            return arr;
        }
    }

}


