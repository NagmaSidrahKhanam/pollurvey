package com.company;

public class HondaCity extends Car
{



//    public HondaCity(int number_of_seats,int speed,String price) {
//        super(number_of_seats,speed);
//        this.price = price;
//    }


    public HondaCity(String licensePlateNumber,int number_of_seats,int speed,String price) {
        super(licensePlateNumber,number_of_seats,speed);
        this.price = price;
    }

    String price;

    @Override
    public String toString() {
        return "HondaCity{" +
                "price='" + price + '\'' +
                ", number_of_seats=" + number_of_seats +
                ", speed=" + speed +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                '}';
    }

    public void specialFeature()
    {
        System.out.println(" This car has fluidic design, loaded-to-the-tooth features and a diesel engine as well, to push the City off the throne.");
    }
}
