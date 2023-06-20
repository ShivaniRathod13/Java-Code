package com.colllection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        SortingList sortingList = new SortingList();
        sortingList.testSortingList();
    }
    public List<Integer> testSortingList() {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
//        System.out.println("Before sorting list:");
//        System.out.println(list);
        Collections.sort(list);
      //  System.out.println("after sorting list:");
        return list;


    }
}
