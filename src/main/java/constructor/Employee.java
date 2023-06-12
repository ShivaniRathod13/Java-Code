package constructor;
//constructor overloading
public class Employee {
    int id;
    String name;
    int age;
    Employee( int i ,String n,int a){
        id=i;
        name=n;
        age=a;
        System.out.println( id+""+name+""+age);
    }
    Employee( int i ,String n){
        id=i;
        name=n;

        System.out.println( id+""+name);

    }

    public static void main(String[] args) {
        Employee emp = new Employee( 20,"rohan",50);
        Employee emp2 = new Employee( 20,"rohan");
    }
}
