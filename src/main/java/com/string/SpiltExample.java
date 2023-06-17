package com.string;

public class SpiltExample {
    public static void main(String args[])
    {
        // Custom input string
       // String str = "geekss@for@geekss";
        String str1= "abc pqr xyz";
      //  String[] arrOfStr = str.split("@", 2);
        String []arrOfStr = str1.split(" ",2);


        for (String a : arrOfStr)
            System.out.println(a);
    }
}
