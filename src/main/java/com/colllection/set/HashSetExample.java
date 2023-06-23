package com.colllection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

public class HashSetExample {
    public static void main(String[] args) {



        }

        public HashSet<String> getHashSetElement(){

            HashSet<String> h = new HashSet<String>();
            h.add("India");
            h.add("Australia");
            h.add("South Africa");
            h.add("India");


            System.out.println(h);
//            System.out.println(
//                    h.contains("India"));
//
//
//            h.remove("Australia");
//            System.out.println(h);
//
//
//
//            Iterator<String> i = h.iterator();
//
//            while (i.hasNext()) {
//                System.out.println(i.next());
//            }

        return h;

        }
    }

