package com.colllection.generic;

public class GenericExample2 {
    public static void main(String[] args) {
       Box<String>box=new Box<String>("wow this is amazing");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer>box1=new Box<Integer>(121);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

        Box<Boolean>box2=new Box<Boolean>(true);
        System.out.println(box2.getValue());
        System.out.println(box2.container.getClass().getName());

        box.performTask();
        box1.performTask();

    }
}
