package com.exception.checkedexcetion;

import static java.lang.Class.forName;

public class FileInputStream {
    public static void main(String[] args) {

        try {

           FileInputStream fileInputStream = new FileInputStream();//FileNotFoundException CheckedException complietime
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
