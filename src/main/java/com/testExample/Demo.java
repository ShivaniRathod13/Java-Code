package com.testExample;

public class Demo {
    public static void main(String[] args) {

    }

    public void foo( boolean a, boolean b)
    {
        if( a )
        {
            System.out.println("A");
        }
        else if(a && b)
        {
            System.out.println( "A && B");
        }
        else
        {
            if ( !b )
            {
                System.out.println( "notB") ;
            }
            else
            {
                System.out.println( "ELSE" ) ;
            }
        }
    }

}
