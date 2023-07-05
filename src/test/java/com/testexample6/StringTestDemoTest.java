package com.testexample6;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringTestDemoTest  {
    StringTestDemo stringTestDemo = new StringTestDemo();

    @Test
    public void should_return_replace_string(){
        Optional<String>stringOptional= new StringTestDemo().getReplaceString();
        assertTrue(stringOptional.isPresent());
        assertEquals("xyzabc",stringOptional.get());
    }



}