package com.stackroute.junitwork;

public class Palindrome {


    public boolean checkPalindrome(String s)
    {
        String reverseString="";
        for(char ch: s.toCharArray()){
            reverseString=ch+reverseString;
        }
        return s.equalsIgnoreCase(reverseString);
    }

}
