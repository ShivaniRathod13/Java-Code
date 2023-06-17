package com.string;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsExampleTest  {
    EqualsExample equalsExample = new EqualsExample();

    @Test
    public void  should_result_compare_strings() {
        assertFalse("result",equalsExample.compareStrings());
    }
}