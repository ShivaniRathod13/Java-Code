package com.testexample6;

public class AssertionDemo {
    public static boolean isDbConnected = true;

    public void runQuery(String query) {
        assert isDbConnected() : "Unable to connect to database";
        System.out.println("query [" + query + "] executed.");
    }

    private boolean isDbConnected() {
        double random = Math.random();
        System.out.println("random number " + random);
        return random > 0.5;
    }

    public static void main(String[] args) {
        AssertionDemo.isDbConnected = false;
        if (args.length > 0) {
            System.out.println("args received by main method " + args[0]);
        }
        new AssertionDemo().runQuery(
                "select * from dual;"
        );
    }
    // for assertion you need to inform jvm to enable assertion check by passing -ea, else asserts are ignored
    //jvm arguments they are sent to jvm/java.exe
    //program arguments they goto main method args variable
}
