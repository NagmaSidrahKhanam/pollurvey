package com.stackroute;

public class Switch {

    private int id;
    private int category;
    private int brand;
    private String switchname;
    private int Amperevalue;
    private String color;
    private String material;
    public boolean switchon;
    public boolean switchof;


    public boolean toggel;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public String getSwitchname() {
        return switchname;
    }

    public void setSwitchname(String switchname) {
        this.switchname = switchname;
    }

    public int getAmperevalue() {
        return Amperevalue;
    }

    public void setAmperevalue(int amperevalue) {
        Amperevalue = amperevalue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isSwitchon() {
        return switchon;
    }

    public void setSwitchon(boolean switchon) {
        this.switchon = switchon;
    }

    public boolean isSwitchof() {
        return switchof;
    }

    public void setSwitchof(boolean switchof)
    {
        this.switchof = switchof;
    }

    public boolean isToggel() {
        Bulb bulb = new Bulb();

        return toggel;
    }

    public void setToggel(boolean toggel) {
        Bulb bulb = new Bulb();
        bulb.setBulbfunction(toggel);
        this.toggel = toggel;
    }
}


