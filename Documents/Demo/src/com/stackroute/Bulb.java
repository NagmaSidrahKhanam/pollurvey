package com.stackroute;
public class Bulb {
    private int id;
    private String barnd;
    private String type;
    public boolean bulbon;
    public boolean bulboff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void switchOff() {

    }

    public void switchOn() {

    }

    public boolean getBulbon(boolean v) {

        return bulbon;

    }

    public void setBulbon(boolean bulbon) {
        this.bulbon = bulbon;
        System.out.println(" Bulb is on");
    }

    public boolean getBulboff( boolean bulboff) {
        return bulboff;
    }

    public void setBulboff(boolean bulboff) {
        this.bulboff = bulboff;
        System.out.println("bulb is off");

    }
//    private String switchstate;

    public boolean bulbfunction;



    public boolean isBulbfunction() {
        return bulbfunction;
    }

    public void setBulbfunction(boolean bulbfunction) {
        if(bulbfunction== true)
        {
            System.out.println("Bulb is On");
        }
        else
        {
            System.out.println("Bulb is Off");
        }
        this.bulbfunction = bulbfunction;
    }
}


//class SwitchOPerations {
//
//    int switch_state;
//
//    public void switchoff() {
//    }
//}