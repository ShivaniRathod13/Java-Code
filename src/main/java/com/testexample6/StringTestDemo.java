package com.testexample6;

import java.util.Optional;

public class StringTestDemo {

    public Optional<String> getReplaceString(){

        String x = "xyz";
        x.toUpperCase(); /* Line 2 */
        String y = x.replace('Y', 'y');
        y = y + "abc";
     //   System.out.println(y);
        return Optional.of(y);
    }
}