package com.testExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTest {

 @Test
    public void testGetResult() {
        B b = new B();
        assertEquals(1, b.GetResult(0,1));
    }
}