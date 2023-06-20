package com.colllection.generic;

public class Box<T> {
    //Object class is a parent class of all java classes
   T container;
    public Box(T container){
        this.container=container;
    }

    public void performTask(){
        if(container instanceof String){
            System.out.println("length of"+container+"is"+(((String)this.container).length()));
        } else if (container instanceof Integer) {

            System.out.println("This is interger"+container);
        }
    }
    public Object getValue(){
        return this.container;
    }
}
