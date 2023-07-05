package com.testexample4;

public interface Base {


        boolean m1 ();
        byte m2(short s);

    }
    abstract class Class2 implements Base {

    }
    abstract class Class3 implements Base
    {
        public boolean m1()

        {

            return (7 > 4);
        }


}
