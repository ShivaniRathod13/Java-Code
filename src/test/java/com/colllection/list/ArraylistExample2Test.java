package com.colllection.list;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArraylistExample2Test {

    ArraylistExample2 arraylistExample2=new ArraylistExample2();
    List<String> list=arraylistExample2.getStrings();

    @Test
    public void test(){

        assertEquals(list.isEmpty(),false);
    }
    @Test
    public void test2()
    {
        assertEquals(list.isEmpty(),true);
    }
    @Test
    public void test3()
    {
        assertEquals(list.size(),5);
    }
    @Test
    public  void test4()
    {
        assertEquals(list.contains("Shivani"),false);
    }
    @Test
    public void test5()
    {
        assertEquals(list.addAll(1,list),true);

    }



}