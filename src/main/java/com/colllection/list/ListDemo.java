package com.colllection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);
         list.add(null);
        System.out.println(list);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//
//            System.out.println(iterator.next());
//
//        }
       ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());
        }



    }


}
