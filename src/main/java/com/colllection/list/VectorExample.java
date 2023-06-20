package com.colllection.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector vec= new Vector(); //initial capacity 10

        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");

        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity is: "+vec.capacity());
        System.out.println(vec);
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");
        System.out.println(vec);

        if(vec.contains("Tiger"))
        {
            System.out.println(vec.indexOf("Tiger"));
        }
        else
        {
            System.out.println("Tiger is not present in the list.");


        }

        System.out.println(vec.firstElement());


        System.out.println(vec.lastElement());

        vec.remove("Rat");
        System.out.println(vec);

        vec.removeElementAt(3);

        System.out.println(vec);

        System.out.println(
                vec.hashCode());

    }


}
