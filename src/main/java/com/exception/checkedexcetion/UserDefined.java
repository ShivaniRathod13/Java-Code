package com.exception.checkedexcetion;
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {

        super(str);
    }
}

public class UserDefined {

    public static void main(String args[])
    {
        try
        {

            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException e)
        {
            System.out.println("Caught the exception");

            System.out.println(e.getMessage());
        }
    }
}
