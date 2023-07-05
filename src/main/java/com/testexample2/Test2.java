package com.testexample2;

import java.util.Optional;

public class Test2 {

        public static void main(String [] args)
        {

        }

    public Optional<Integer> updateValues(int x, int y) {
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) || (++y > 2)) {
                x++;
            }
        }
     Integer result = Integer.valueOf(x + " " + y);
        return Optional.of(result);
    }
    }
