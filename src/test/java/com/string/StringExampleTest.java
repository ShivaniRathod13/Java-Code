package com.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class StringExampleTest {
    StringExample stringExample = new StringExample();

    @Test
    public void should_return_string_print() {
     assertEquals("shivi",new StringExample().printStrings());

    }
    @Test
    public void should_return_print_ascii(){
        assertEquals("GFGHI",new StringExample().printAscii());

    }
    @Test
    public void should_return_string_length(){
        assertEquals(13,new StringExample().stringLengthTest());
    }



}
