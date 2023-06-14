package com.exception;

public class Voting {

    public String validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("you are not eligible for voting");
            } else {
                System.out.println("you are eligible for voting");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

       // return age;
        return "You are eligible for voting";
    }

    public static void main(String[] args) {
        Voting voting = new Voting();
        voting.validate(13);
    }
}