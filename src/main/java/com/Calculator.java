package com;

import java.util.Scanner;

public class Calculator {
    public static  void main(String[] args) {
        char op;
        int a,b,result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a= sc.nextInt();
        System.out.println("Enter second number");
        b= sc.nextInt();
        System.out.println("Enter first number +,-,*,/");
        op =sc.next().charAt(0);





        switch (op){
            case '+':
                 result =a+b;
                System.out.println(a + " + " + b+ " = " + result);
                break;

            case '-':
                result =a-b;
                System.out.println(a + " -" + b+ " = " + result);
                break;

            case '*':
                result =a*b;
                System.out.println(a + " * " + b+ " = " + result);
                break;

            case '/':
                result =a/b;
                System.out.println(a + " / " + b+ " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;

        }

    }
}
