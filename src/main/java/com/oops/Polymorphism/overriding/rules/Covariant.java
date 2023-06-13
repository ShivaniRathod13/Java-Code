package com.oops.Polymorphism.overriding.rules;

 class Vehicle{
     Object run(){
         System.out.println("safe");
       return null;



     }

 }
 class Bus extends  Vehicle{
     String run(){
         System.out.println("safe running...");
             return null;

         }



 }



public class Covariant {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
        Bus b = new Bus();
        b.run();
    }
}

