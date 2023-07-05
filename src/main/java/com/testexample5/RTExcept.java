package com.testexample5;

import java.util.Optional;

public class RTExcept {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        Optional<String> result = performOperation();
        if (result.isPresent()) {
            System.out.println("Result: " + result.get());
        } else {
            System.out.println("Exception occurred.");
        }
    }

    public static Optional<String> performOperation() {
        try {
            System.out.print("hello ");
            throwit();
            return Optional.of("Success");
        } catch (Exception re) {
            System.out.print("caught ");
            return Optional.empty();
        } finally {
            System.out.print("finally ");
        }
    }

    public static void throwit() {
        System.out.print("throwit ");
        throw new RuntimeException();
    }
}
