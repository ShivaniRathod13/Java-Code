package com.colllection.testExample1;

import java.util.Optional;

public class If1 {
    static boolean b;

    public Optional<Short> returnShortValue() {
        short hand = 42;
        if (hand < 50 && !b) /* Line 7 */
            hand++;
        if (hand > 50) ;     /* Line 9 */
        else if (hand > 40) {
            hand += 7;
            hand++;
        } else
            --hand;
        System.out.println(hand);

        return Optional.of(hand);
    }


    public Optional<Integer> processI() {
        int I = 0;
        label:
        if (I < 2) {
             System.out.print("I is " + I);
             I++;

        }
        return Optional.of(I);
    }

    public Optional<CharSequence> getSubString(){

        String a = "newspaper";
        a = a.substring(5,7);
        char b = a.charAt(1);
        a = a + b;
        System.out.println(a);
        return Optional.of(a);

    }
    public Optional<Double> sqrtExample(double value){
        return Optional.of(Math.sqrt(value));
    }



}









