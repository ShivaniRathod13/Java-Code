package com.colllection.list;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinkedListExampleTest  {
    LinkedListExample linkedListExample =new LinkedListExample();


   LinkedList<String> list=linkedListExample.getLinkedList();
    @Test
    public void test(){

        assertEquals(false,list.isEmpty());
    }
    @Test
    public void test1(){
        assertEquals(true,list.offer("Abc"));
    }
    @Test
    public void test2()
    {
            assertEquals(true,list.addAll(Arrays.asList("Mohit","Singh","Rajput")) );
            System.out.println(list);
    }
    @Test
    public void test3()
    {
        assertEquals(0,list.indexOf("Ravi"));
    }
}