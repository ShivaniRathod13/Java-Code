package com.testexample4;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoExampleTest  {
  DoExample doExample = new DoExample();

    @Test
    public void testExecuteDoExample() {
        assertEquals("5 6", doExample.executeDoExample().toString());
    }
}