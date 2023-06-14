package com.problemsloving;

import junit.framework.TestCase;
import org.junit.Test;

public class ArrayTest extends TestCase {
    Array array  = new Array();

    @Test
     public void testArray(){
        float[] f1 = new float[10];
        float[]f2 = f1;
        assertEquals(0.0,f2[0],0.001);
    }

}