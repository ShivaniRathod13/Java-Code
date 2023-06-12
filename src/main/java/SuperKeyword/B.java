package SuperKeyword;
class A{
    A(){
        System.out.println(" i class A");
    }
    int i =10;
}
public class B extends A {
    int i = 20;
    B(){
        super();
        System.out.println("i class B");
    }

    void show(int i) {
        System.out.println(this.i);
        System.out.println(super.i);
        System.out.println(i);


    }
}
    class C extends B{
         C(){
             super();
             System.out.println("I am c");
         }
        void display(){
            super.show(30);
        }



    public static void main(String[] args) {
        C c = new C();
//        b.show(30);
        c.display();


    }
}