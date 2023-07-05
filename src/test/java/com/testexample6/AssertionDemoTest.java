package com.testexample6;

import org.junit.Test;

public class AssertionDemoTest {

    @Test(expected = AssertionError.class)
    public void should_eventually_fail() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("try number " + i);
            new AssertionDemo().runQuery("select * from dual;");
        }
    }
}