package com.oops.SuperKeyword;
class Animal{
    String color = "white";

}
class Dog extends Animal{
    String color = "Black";
    void setColor(){
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setColor();
    }



}
