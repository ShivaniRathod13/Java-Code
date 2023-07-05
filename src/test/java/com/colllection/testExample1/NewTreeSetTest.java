package com.colllection.testExample1;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewTreeSetTest{

    NewTreeSet newTreeSet = new NewTreeSet();

    @Test
    public void should_clear_the_internal_TreeMap(){
        assertTrue(newTreeSet.isEmpty());
        assertEquals(0, newTreeSet.size());
    }

}