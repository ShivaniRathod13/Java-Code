package com.exception.checkedexcetion;

public class ClassNotFoundException {
    public static void main(String[] args) {
        try {
            Class.forName("com.mySql");//ClassNotFoundException  CheckedException and Complietime
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
