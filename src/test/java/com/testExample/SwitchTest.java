package com.testExample;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SwitchTest  {
    Switch aSwitch = new Switch();
   @Test
    public void testReturnBitwiseOperatorValue_withValidInput() {
        Float inputValue = new Float("12");
        Optional<Integer> integerOptional= new Switch().returnIntergerValue(inputValue);
        assertTrue(integerOptional.isPresent());
        assertEquals(12,(int) integerOptional.get());
    }

}