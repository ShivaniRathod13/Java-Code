package com.colllection.testExample1;

import com.testExample.X;

import java.util.Optional;

public class If2 {

    static boolean b1, b2;
    public Optional<Integer> getIntegerValue(int x){
        x = 0;
        if ( !b1 )
        {
            if ( !b2 )
            {
                b1 = true;
                x++;
                if ( 5 > 6 )
                {
                    x++;
                }
                if ( !b1 )
                    x = x + 10;
                else if ( b2 = true )
                    x = x + 100;
                else if ( b1 | b2 )
                    x = x + 1000;
            }
        }

        return Optional.of(x);
    }
}
