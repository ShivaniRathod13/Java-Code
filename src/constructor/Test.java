package constructor;
//no argument
public class Test {
    int i;
    String s;
    Test(){
        System.out.println("no gru");
    }

    public static void main(String[] args) {
    Test t = new Test();
        System.out.println(t.i);
        Test1 ts = new Test1(10);
    }

}
class Test1{
    Test1( int a){
        System.out.println("parameter");

    }
}

