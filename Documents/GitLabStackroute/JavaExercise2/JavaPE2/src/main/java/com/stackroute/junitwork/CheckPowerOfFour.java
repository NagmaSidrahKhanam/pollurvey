package com.stackroute.junitwork;

public class CheckPowerOfFour {
        public  boolean isPower(int num)
        {
            boolean result=true;
            while(num!=1){
                if(num%4 !=0){
                    result=false;
                    break;
                }
                num/=4;
            }

            return result;
        }
}
