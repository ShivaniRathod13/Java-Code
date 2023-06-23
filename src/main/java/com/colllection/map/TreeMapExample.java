package com.colllection.map;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class TreeMapExample {
    public Optional<TreeMap<Integer,String>> getTreeMapElement(){
      TreeMap<Integer,String>treeMap =new TreeMap<>();
        treeMap.put(100,"Anjali");
        treeMap.put(102,"Riya");
        treeMap.put(101,"Pratima");
        treeMap.put(103,"Kamini");
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.ceilingEntry(104));
//        System.out.println(treeMap.containsKey(103));
//        System.out.println(treeMap.firstKey());
//        System.out.println(treeMap.floorEntry(104));
//      System.out.println(treeMap.headMap(102));//only store one
//      System.out.println(treeMap.higherEntry(102));
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.subMap(102,104));
        return Optional.of(treeMap);

    }
}
