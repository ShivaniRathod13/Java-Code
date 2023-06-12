package classandobject;

public class Animal {



    public void eat(){
        System.out.println("eating");
    }
    public void run(){
        System.out.println("runing");
    }



    public static void main(String[] args) {
        //object
        Animal dog=new Animal();
        dog.eat();
        dog.run();
        Birds owl=new Birds();
        owl.fly();
        //By reference variable
        Cat c= new Cat();
        c.age=5;
        c.color="black";
        System.out.println(c.age+" "+c.color);
        Student stu =new Student();
        stu.details("Shivani",20);
        System.out.println(stu.name+" "+stu.id);


    }
}
class Birds{
    void fly(){
        System.out.println("flying");
    }
}

class Cat {
    //By reference variable

    String color;//instance variable
    int age;

}
// //By method call object
class Student{
    String name;
    int id;
    void details( String n,int i){
        // instance  varble inliz by local var
        name=n;
        id=i;

    }
}

