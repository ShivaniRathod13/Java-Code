package com.oops.constructor;

public class Car {
    private String make;
    private String model;
    private int year;


    Car( String make,String model,int year){
        System.out.println( make +" "+ model+" "+year);

    }

    public static void main(String[] args) {
        Car car = new Car( "Toyota", "Camry", 2021 );
    }
}
