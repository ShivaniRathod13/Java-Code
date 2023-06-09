package Polymorphism.overriding.rules;

class Parent{
    void msg() {
        System.out.println("parent method");
    }
}

class Child extends Parent{
    void msg()throws ArithmeticException {
        System.out.println("child method");
    }
}
public class OverrideException {
    public static void main(String[] args) {
        Parent p = new Child();
        p.msg();

    }
}

