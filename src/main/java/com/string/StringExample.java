package com.string;

import java.io.File;
import java.util.Optional;

public class StringExample {


    public static void main(String args[]) {
        StringExample stringExample = new StringExample();
        stringExample.printStrings();
        stringExample.printAscii();

        stringExample.stringLengthTest();
        stringExample.reverse();
    }

    public String printStrings() {
        char c[] = { 's', 'h', 'i','v','i' };
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s2);
        return s2;

    }
    public String printAscii(){
        byte ascii[]={71,70,71,72,73};

        String s1= new String(ascii);
        System.out.println(s1);

        String s2= new String(ascii,1,4);
        System.out.println(s2);
        return s1;
    }


    public int stringLengthTest( ){
       String str = "StringConcept";
        System.out.println(str.length());
        return str.length();
    }

    //reverse order
    public void reverse()

    {
        String str = "Welcome To JavaTpoint";
        int size = str.length();

        System.out.println(str);

        for(int i = 0; i < size; i++)
        {
         // printing in reverse order
            System.out.print(str.charAt(str.length() - i - 1));
        }



    }


}
