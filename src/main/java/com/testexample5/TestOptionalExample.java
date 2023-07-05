package com.testexample5;

import java.util.Optional;

public class TestOptionalExample {


        public Optional<String> getOptionalReturnOperator(){
            int x=20;
            String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
            System.out.println(sup);
            return Optional.of(sup);
        }


    public  Optional<Integer> printNumbers() {
        int i = 1;
        do {
            System.out.println("I is " + i);
            i++;
        } while (i < 1);
        return Optional.of(i);
    }




}

