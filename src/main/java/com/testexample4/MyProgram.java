package com.testexample4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyProgram {
    public static void main(String args[]) {
        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            out = new FileOutputStream("test.txt");
            out.write(122);
            out.close();

            // Read and print the content of the file
            in = new FileInputStream("test.txt");
            int data = in.read();
            System.out.println("Content of the file: " + (char) data);
        } catch (IOException io) {
            System.out.println("IO Error.");
        } finally {
            try {
                if (out != null) {
                    out.close();
                }

            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}
