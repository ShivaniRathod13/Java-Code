package com.exception.checkedexcetion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;

public class ThorwsExample {

    public static Optional<File> method(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (file.exists()) {
            return Optional.of(file);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String args[]) {
//        if(method("c:\text.t")){
//
//        }

    }

}
