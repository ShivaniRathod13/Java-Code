package com.colllection.map;

import java.util.*;

public class HasMapExample {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println(map);

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(map.get(5));
//        Set set = map.entrySet();
//        System.out.println(set);
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
////            System.out.println(iterator.next());
//            //map.entry this is interface
//           Map.Entry entry=(Map.Entry)iterator.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }


    }

    public Optional<Map<Integer ,String>> getElementOptionalSize(){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        return  Optional.of(map);

    }
}
