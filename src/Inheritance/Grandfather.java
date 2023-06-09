package Inheritance;
//Multilevel Inheitance
class Grandfather {
    public void grandfather() {
        System.out.println("I am the Grandfather.");
    }
}

    class Father extends Grandfather {
        public void father() {
            System.out.println("I am the Father.");
        }
    }

    class Son extends Father {
        public void son() {
            System.out.println("I am the Son.");
        }



    public static void main(String[] args) {
        Son son = new Son();

        son.grandfather();
        son.father();
        son.son();
    }
}