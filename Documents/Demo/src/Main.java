import com.stackroute.Switch;

import java.util.Scanner;


public class Main {

    public static void main(String [] args)
    {
//        Bulb bulb = new Bulb();
        Switch obj = new Switch();
//        boolean on=true;
//        boolean off=true;



        Scanner myObj = new Scanner(System.in);
        System.out.println("Switch   :  ");

        String sw =  myObj.nextLine();
        System.out.println("sw  "+sw);

        if(sw == "on")
        {
            obj.setToggel(true);
        }
        else
        {
            obj.setToggel(false);
        }


        /*Scanner myObj = new Scanner(System.in);
        System.out.println("Enter true to on and false to off the bulb  :  ");
        boolean toggles = Boolean.parseBoolean(myObj.nextLine());

//        boolean toggle = false;
        if(toggles == true){
            bulb.setBulbon(true);
        }
        else
        {
            bulb.setBulboff(false);
        }*/


//................
//        boolean toggle = false;
//                if(toggle == on){
//                    bulb.setBulbon(true);
//                }
//                else
//                {
//                    bulb.setBulboff(false);
//                }
//
//
//        if(toggle == off){
//            bulb.setBulboff(true);
//        }
//        else
//        {
//            bulb.setBulboff(false);
//        }
//''''''''
//        if (obj.switchon == true)
//        {
//            bulb.setBulbon(true);
////            System.out.println(" Bulb is On");
//        }
//        else
//        {
//            bulb.setBulbon(false);
////            System.out.println("Bulb is off");
//        }


//        if (obj.switchon=on){
//            bulb.setBulbon(true);
//            System.out.println(" bulb is on");
//        }
    }
}
