package com.testexample4;

public class DoExample {
    public static void main(String[] args) {
        DoExample doExample = new DoExample();
        doExample.executeDoExample();
    }

    public String executeDoExample() {
        int i = 1, j = 10;
        do {
            if (i > j) {
                break;
            }
            j--;
        } while (++i < 5);
       // System.out.println("i = " + i + " and j = " + j);
        return   i+" "+j;
    }
}
