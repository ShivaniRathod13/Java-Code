package com.testexample4;

public class OddExample {
    public static void main(String[] args) {
        OddExample oddExample = new OddExample();
        oddExample.test(5); // Call the test method with an example value
    }

    public void test(int x) {
        if (x % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
