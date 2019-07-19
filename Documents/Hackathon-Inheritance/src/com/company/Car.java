package com.company;

public class Car extends Vehicle {
        int number_of_seats;
        int speed;
        //int change_gears;



    public Car(String licensePlateNumber,int number_of_seats,int speed) {
        super(licensePlateNumber);
        this.number_of_seats = number_of_seats;
        this.speed = speed;
    }




        public void applyBreak(int decrement)
        {
            System.out.println("Speed is "+this.speed);
            speed-=decrement;
        }
        public void speedUp(int increment)
        {
            System.out.println("Speed is "+this.speed);
            speed+=increment;
        }

//        public int getNumber_of_seats() {
//            return number_of_seats;
//        }
//
//        public void setNumber_of_seats(int number_of_seats) {
//            this.number_of_seats = number_of_seats;
//        }
//
//        public int getSpeed() {
//            return speed;
//        }
//
//        public void setSpeed(int speed) {
//            this.speed = speed;
//        }

       //

    @Override
    public String toString() {
        return "Car{" +
                "number_of_seats=" + number_of_seats +
                ", speed=" + speed +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                '}';
    }
}


