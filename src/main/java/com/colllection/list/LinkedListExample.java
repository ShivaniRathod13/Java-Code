package com.colllection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        System.out.println(al);

        LinkedList<String> al2 = new LinkedList<>();
       al2.add("Sonoo");
       al2.add("Hanumat");
       al2.add("sumit");
        al2.add("Gaurav");
        al2.add("Gaurav");

        al.addAll(al2);
        System.out.println(al);

        al.addFirst("Amit");
        System.out.println(al);

        al2.addLast("Harsh");
        System.out.println(al2);

        al.addAll(1,al2);
        System.out.println(al);


        al.removeAll(al2);
        System.out.println(al);



        al.removeFirst();
        System.out.println(al);
        //Removing first element from the list
        al2.removeLast();
        System.out.println(al2);

        al2.removeFirstOccurrence("Gaurav");

        //Removing last occurrence of element from the list
        al.removeLastOccurrence("Ravi");
        System.out.println(al);

        //Removing all the elements available in the list
        al.clear();
        System.out.println(al);



    }

}
