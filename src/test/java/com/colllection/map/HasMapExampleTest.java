package com.colllection.map;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HasMapExampleTest  {

    HasMapExample hasMapExample = new HasMapExample();

    @Test
    public void should_return_Optional_get_element() {

        Optional<Map<Integer, String>> mapOptional = new HasMapExample().getElementOptionalSize();
        assertTrue(mapOptional.isPresent());
        Map<Integer, String> map = mapOptional.get();
        assertEquals("Grapes", map.get(4));
       // assertEquals(4,map.size());
    }

    @Test
    public void should_return_Optional_size_of_element() {

        Optional<Map<Integer, String>> mapOptional = new HasMapExample().getElementOptionalSize();
        assertTrue(mapOptional.isPresent());
        Map<Integer, String> map = mapOptional.get();
        assertEquals(4,map.size());
    }


}