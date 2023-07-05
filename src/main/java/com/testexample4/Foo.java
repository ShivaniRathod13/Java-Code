package com.testexample4;

class Foo
{
    class Bar{ }
}
class Test
{
    public static void main (String [] args)
    {
        Foo f = new Foo();
        /* Line 10: Missing statement ? */
        Foo.Bar b = f.new Bar();
    }
}
