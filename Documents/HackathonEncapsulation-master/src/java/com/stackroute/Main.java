package com.stackroute;

public class Main {

    public static void main(String[]args){

        Printer printer = new Printer();

        // setting values of the variables
        printer.setTonnerlevel(16);
        printer.setDuplexprinter(false
        );
        printer.setPagesavailable(10);
        printer.setPagestobeprinted(50);

        printer.checkTonerLevel();

        System.out.println("It is duplex printer: "+printer.getDuplexprinter());
        System.out.println("The available pages are: "+ printer.getPagesavailable());
        System.out.println("Tonner level : "+printer.getTonnerlevel());

        System.out.println("NO. of pages can be printed by printer for this tonner level: "+printer.getPagesprinted());

        System.out.println("So, no. of pages printing possible as per your requirement is :"+printer.getPagestobeprinted());

        // Direct access of getDuplexprinter getDuplexprinter getDuplexprinter  etc is not possible
        // due to encapsulation

    }
}
