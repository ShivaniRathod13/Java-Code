package com.string;

public class EqualsExample {
    public static void main(String[] args) {
        EqualsExample  equalsExample= new EqualsExample();
       equalsExample.compareStrings();
       equalsExample.compareEqualsStrings();
       equalsExample.testSubSquence();
    }

    public boolean compareStrings() {
       String s1 = new String("deepak");
       String s2 = new String("deepak");
        System.out.println(s1 == s2);//false

        String s3 = "amit";
        String s4 = "amit";
        System.out.println(s3 == s4);//true

        boolean result = s3 == s4 && s1 == s2;
        return  result;



    }

    public void compareEqualsStrings(){
        String s1 = new String("deepak");
        String s2 = new String("deepak");
        System.out.println(s1.equals(s2));//true


    }
    public  void testSubSquence(){
        String s = "this is demo";
        System.out.println(s.subSequence(3,9));
        System.out.println(s.substring(3,9));
        System.out.println(s.substring(4));
    }

}
