package com.testExample;

import java.util.Optional;

public class Switch {
    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        //  aSwitch.returnBitwiseOperatorValue();
      //  aSwitch.returnStringValue();

    }


    public Optional<Integer> returnIntergerValue(Float inputValue) {
        int intValue = inputValue.intValue(); // Convert Float to int

        switch (intValue) {
            case 12:
                return Optional.of(12);
            case 0:
                return Optional.of(0);
            default:
                return Optional.empty();
        }
    }
}