package com.colllection.set;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HashSetExampleTest  {
    HashSetExample hashSetExample = new HashSetExample();

    HashSet<String> hashSet= hashSetExample.getHashSetElement();



    @Test
    public void test2()
    {
        assertEquals(hashSet.isEmpty(),true);
    }
    @Test
    public void test3()
    {
        assertEquals(3,hashSet.size());
    }
    @Test
    public  void test4()
    {
        assertEquals(hashSet.contains("Shivani"),false);
    }

    @Test
        public void test5 (){
        assertEquals(true,hashSet.remove("Australia"));
    }





}