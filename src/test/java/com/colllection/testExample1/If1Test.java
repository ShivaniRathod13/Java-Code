package com.colllection.testExample1;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class If1Test  {
    If1 if1 = new If1();

    @Test

    public void should_return_short_value( ){
        Optional<Short>optionalShort = new If1().returnShortValue();
        assertTrue(optionalShort.isPresent());
        assertEquals(51,(short)optionalShort.get());


    }
    @Test
    public void should_return_process_result( ){
        Optional<Integer>optionalShort = new If1().processI();
        assertTrue(optionalShort.isPresent());
        assertEquals(1,(int)optionalShort.get());


    }

    @Test
    public void should_return_get_sub_String_result( ){
        Optional<CharSequence>stringOptional= new If1().getSubString();
        assertTrue(stringOptional.isPresent());
        assertEquals("app",stringOptional.get());


    }
    @Test
    public void should_return_get_sqrt_result( ){
        Optional<Double>optionalDouble= new If1().sqrtExample(-9.0);
        assertTrue(optionalDouble.isPresent());
        assertTrue(Double.isNaN(optionalDouble.get()));


    }

}