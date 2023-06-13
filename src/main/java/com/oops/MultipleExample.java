package com.oops;

interface  Son{
      void nameOfs();
} 
interface Daughter{
     void nameOfd();

}
class Father implements Son ,Daughter   {

     @Override
     public void nameOfs() {
          System.out.println("son of father");
     }

     @Override
     public void nameOfd() {
          System.out.println(" daughter of father");
     }
}

public class MultipleExample {
     public static void main(String[] args) {
          Father father =new Father();
          father.nameOfs();
          father.nameOfd();
     }


}
