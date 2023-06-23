package com.colllection.map;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapDemoTest {
    MapDemo mapDemo = new MapDemo();

    Map<Integer,String> map= mapDemo.getMapElement();


    @Test
    public void getContainElement(){
     assertEquals(true,map.containsKey(100));
    }

    @Test
    public void getContainsElement(){
        assertEquals(true,map.containsValue("Amit"));
    }
    @Test
    public void getElementSize(){
        assertEquals(3,map.size());
    }


    @Test
    public void getElement(){
        assertEquals("Rahul",map.get(102));
    }

    @Test//du
    public void getReplaceElement(){
        assertTrue(map.replace(102,"Rohan"), true);
        assertEquals("Rohan",map.replace(102,"Rohan"));
    }

    @Test
    public void getNullElement(){
        assertTrue(String.valueOf(map.get(109)==null),true);
        //assertEquals(null,map.get(109));
    }

    @Test
    public void getRemoveElement(){
        assertTrue(String.valueOf(map.remove(100)=="Amit"),true);
      //  assertEquals("Amit ",map.remove(100));
    }



}