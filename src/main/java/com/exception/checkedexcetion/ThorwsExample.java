package com.exception.checkedexcetion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThorwsExample {

    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("C:/abc.txt");

        throw new FileNotFoundException();

    }

    public static void main(String args[]){

        try
        {
            method();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("finished");
        }

    }

}
