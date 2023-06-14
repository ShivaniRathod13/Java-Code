package com.exception.uncheckedexception;

import junit.framework.TestCase;

public class UnchekedExceptionTest extends TestCase {

    UnchekedException unchekedException = new UnchekedException();


    public void testArrayOutOfBoundsException() {
             int s[]={1,2,3};
        assertEquals("Index 3 out of bounds for length 3",unchekedException.arrayOutOfBoundsException(s));
    }
    public void testArithmeticException(){
        assertEquals("/ by zero",unchekedException.arithmeticException(10,0));
    }
    public void testNullPointerException(){
        assertEquals("Cannot invoke \"String.length()\" because \"name\" is null",unchekedException.nullPointerException(null));

    }
    public void  testNumberFormatException(){
        assertEquals("For input string: \"abc\"",unchekedException.numberFormatException("abc"));
    }
}