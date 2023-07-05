package com.testexample5;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOptionalExampleTest {
    TestOptionalExample example = new TestOptionalExample();

    @Test
    public void should_get_optional_operator(){
        Optional<String>optional = new TestOptionalExample().getOptionalReturnOperator();
        assertTrue(optional.isPresent());
        assertEquals( "tiny",optional.get());
    }

    @Test
    public void should_get_optional_print_number(){
        Optional<Integer>optionalInteger= new TestOptionalExample().printNumbers();

      assertTrue(optionalInteger.isPresent());
       assertEquals(2,(int) optionalInteger.get());

    }

}