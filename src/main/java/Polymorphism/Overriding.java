package Polymorphism;
class Bank{
    int interest(){
        return  0;
    }
}
class SBI extends Bank{

    @Override
    int interest() {
        return 8;
    }
}
class HDFC extends Bank{
    @Override
    int interest() {
        return 10;
    }
}
class BOI extends  Bank{
    @Override
    int interest() {
        return 7;
    }
}
class ICICI extends  Bank{
    @Override
    int interest() {
        return  9;
    }
}



public class Overriding {
    public static void main(String[] args) {
        SBI sbi =new SBI();
        HDFC hdfc =new HDFC();
        BOI boi =new BOI();
        ICICI icici=new ICICI();
        System.out.println("SBI Rate of Interest: "+sbi.interest());
        System.out.println("HDFC Rate of Interest: "+hdfc.interest());
        System.out.println("ICICI Rate of Interest: "+icici.interest());
        System.out.println("BOI Rate of Interest:"+boi.interest());



    }
}
