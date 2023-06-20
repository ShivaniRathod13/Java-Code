package com.colllection.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();//this one  type safety
      //  list.add("ABCD");
        list.add(123);

        List list1 = new ArrayList();//this one not type safety
        list1.add("abcd");
        list1.add(12);
        list1.add(12.3);
        System.out.println(list);
        System.out.println(list1);



    }
}
