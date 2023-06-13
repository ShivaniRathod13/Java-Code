package com.exception.uncheckedexception;

public class ArithmeticException {

        public static void main(String[] args){
            int a=10, b=0;
            int c;
            c=a/b;//ArithmeticException & runtime Exception
            System.out.println(c);
        }

}
