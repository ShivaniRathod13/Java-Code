package com.colllection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
       // map.put(null,null);
       // map.put(null,"sonu");
      //  System.out.println(map.containsKey(100));
      //  System.out.println(map.containsValue("Rohit"));
      //  System.out.println(map.get(102));
       // System.out.println(map.remove(101));
      //  map.replace(102,"Rohan");
      //  System.out.println(map);
      //  System.out.println(map.size());

       // System.out.println(map);

    }

    public Map <Integer,String> getMapElement(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");


        return map;
    }
}
