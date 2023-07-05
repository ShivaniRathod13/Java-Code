package com.testexample4;

import java.util.Iterator;
import java.util.Optional;
import java.util.TreeSet;

public class IteratorAndMap {
    public static void main(String[] args) {


    }
    public Optional<TreeSet<String>> returnOptionalTreeSet(){
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() )
        {
            System.out.print( it.next() + " " );
        }
        return Optional.of(map);
    }

}
