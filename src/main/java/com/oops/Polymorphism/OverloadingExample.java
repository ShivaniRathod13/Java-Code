package com.oops.Polymorphism;
//changing no. of arguments
class Calculator{

    public int add;

    int sum(int a, int b){
        return a+b;
    }

     int sum(int a, int b, int c){
        return  a+b+c;
    }
    //changing data type of arguments

    int sum(int a){return a;}
    double sum(double a, double b)
    {return a+b;
    }
   // Overloading with TypePromotion
   void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c,int d){System.out.println(a+b+c);}

    //main method overloaded
    public static void main(int a) {
        System.out.println("main method 1");

    }
    //using Varargs
    void sum(int...a){

    }


}



public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println("main");

        Calculator ref =new Calculator();
         ref.main(20);
        System.out.println(ref.sum(11,10));
        System.out.println(ref.sum(4,9,8));
        System.out.println(ref.sum(4));
        System.out.println(ref.sum(23.4,54.7));
        System.out.println( ref.sum(20,20));
        System.out.println(ref.sum(20,20,20));
        System.out.println(ref.sum(10,67,9));






    }



}
