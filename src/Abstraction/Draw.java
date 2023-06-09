package Abstraction;

 abstract class Shape{
     abstract void draw();

}
     class Rectangle extends Shape{
        void draw(){System.out.println("draw rectangle");}
        }
class Circle extends Shape{
    void draw(){System.out.println("draw circle");}
}





public class Draw {
    public static void main(String[] args) {

      Rectangle rectangle = new Rectangle();
        rectangle.draw();
       Circle circle = new Circle();
        circle.draw();
    }

}
