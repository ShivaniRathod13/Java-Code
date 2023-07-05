package com.colllection.testExample1;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class If2Test {
    If2 if2 = new If2();

    @Test
    public void should_return_integer_value() {
        Optional<Integer>integerOptional = new If2().getIntegerValue(0);
      assertTrue(integerOptional.isPresent());
        assertEquals(101,(int)integerOptional.get());
    }


}