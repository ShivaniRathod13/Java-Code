package com.testExample;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoolArrayTest {

    @Test
    public void testCount() {
        BoolArray ba = new BoolArray();
        ba.set(ba.b, 0);
        ba.set(ba.b, 2);
        ba.test();


      assertEquals(3 , ba.getCount());
    }
}