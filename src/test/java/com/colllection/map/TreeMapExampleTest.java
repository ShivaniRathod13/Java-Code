package com.colllection.map;

import org.junit.Test;

import java.util.Optional;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TreeMapExampleTest {
    TreeMapExample treeMapExample = new TreeMapExample();

    //    @Test
//    public void should_return_Optional__element() {
//
//        Optional<Map<Integer, String>> optionalTreeMap = new TreeMapExample().getTreeMapElement();
//        assertTrue(optionalTreeMap.isPresent());
//        Map<Integer, String> map = optionalTreeMap.get();
//        assertEquals(4,map.size());
//    }
    @Test
    public void should_return_Optional_get_Descending_element() {
        Optional<TreeMap<Integer, String>> treeMapElement = treeMapExample.getTreeMapElement();
        TreeMap<Integer, String> treeMap = treeMapElement.get();
        // assertTrue(treeMap != null);
        assertEquals(treeMap, treeMap.descendingMap());

    }

    @Test
    public void should_return_Optional_Set_Key_element() {
        TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) treeMapExample.getTreeMapElement().orElse(null);
        //   assertTrue(treeMap != null);
        assertEquals("[100, 101, 102, 103]", treeMap.keySet().toString());
    }

    @Test
    public void should_return_Optional_Ceiling_Entry_element() {
        TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) treeMapExample.getTreeMapElement().orElse(null);
        assertTrue(treeMap != null);
        assertEquals("102=Riya", treeMap.ceilingEntry(102).toString());
    }


}
