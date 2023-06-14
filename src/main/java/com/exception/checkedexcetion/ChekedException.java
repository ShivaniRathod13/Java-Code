package com.exception.checkedexcetion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ChekedException {
    public  String fileNotFoundException(String fileName){
        PrintWriter pw;
        try {
            pw = new PrintWriter(fileName);

            pw.println("xyz");
        }catch (FileNotFoundException e){

            return e.getMessage();

        }
        return ""+pw;
    }

    public static void main(String[] args) {
        ChekedException chekedException = new ChekedException();
        chekedException.fileNotFoundException("/jtp.txt");
    }
}
