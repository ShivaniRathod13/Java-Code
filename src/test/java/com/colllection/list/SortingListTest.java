package com.colllection.list;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortingListTest {
    SortingList sortingList = new SortingList();
    List<Integer>list=sortingList.testSortingList();
    @Test
     public void testSortedList(){
        assertEquals(list, Arrays.asList(1,2,3,4));
    }
}