package com.colllection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]){
       // ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        ArrayList list = new ArrayList();
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);

       // ArrayList<Integer>list1 =new ArrayList<>();
        ArrayList list1 = new ArrayList();
        list.add("Banana");
        list.add("Grapes");
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);
        System.out.println(list1);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




       //addAll method
        list.addAll(list1);
        System.out.println(list);

        //add method return boolean
        System.out.println(list.add("aaa"));
        System.out.println(list);

        //contains method return boolean
        System.out.println(list.contains("Apple"));//true

        //isEmpty method return boolean
        System.out.println(list.isEmpty());//false

        //size
        System.out.println(list1.size());

        //remove
        list.remove(0);
        System.out.println(list);

        list.removeAll(list1);
        System.out.println(list1);

        System.out.println(list1);
        list1.clear();
        System.out.println(list1);

        System.out.println(list.indexOf("Grapes"));

        System.out.println(list.get(3));









    }
}
