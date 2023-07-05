package com.testexample4;

import com.colllection.map.HasMapExample;
import com.colllection.testExample1.If1;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IteratorAndMapTest {
    IteratorAndMap iteratorAndMap = new IteratorAndMap();

    @Test
    public void should_return_optional_tree_set(){
        Optional<TreeSet<String>>optionalStringTreeSet = new IteratorAndMap().returnOptionalTreeSet();
        assertTrue(optionalStringTreeSet.isPresent());
        assertEquals((Arrays.asList("four", "one", "three", "two")), new ArrayList<>(optionalStringTreeSet.get()));

    }





}