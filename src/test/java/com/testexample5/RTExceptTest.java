package com.testexample5;

import com.testexample5.RTExcept;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class RTExceptTest {
    RTExcept rtExcept = new RTExcept();


    @Test
    public void testPerformOperation_Success() {
        Optional<String> result = rtExcept.performOperation();

        assertTrue(result.isPresent());
        assertEquals("Success", result.get());
    }

    @Test
    public void testPerformOperation_Exception() {
        Optional<String> result = null;
        try {
            result =rtExcept.performOperation();
        } catch (RuntimeException e) {

        }

        assertFalse(result.isPresent());
    }
}
