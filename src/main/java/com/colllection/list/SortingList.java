package com.colllection.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        SortingList sortingList = new SortingList();
        sortingList.testSortingList();
    }
    public void testSortingList() {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
//        System.out.println("Before sorting list:");
//        System.out.println(list);
        Collections.sort(list);
      //  System.out.println("after sorting list:");
        System.out.println(list);


    }
}
