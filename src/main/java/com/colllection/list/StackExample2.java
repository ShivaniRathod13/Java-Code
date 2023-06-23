package com.colllection.list;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample2 {
    public static void main(String args[])
    {

        Stack<Integer> stk = new Stack<>();
        pushelmnt(stk, 20);
        pushelmnt(stk, 13);
        pushelmnt(stk, 89);
        pushelmnt(stk, 90);
        pushelmnt(stk, 11);
        pushelmnt(stk, 45);
        pushelmnt(stk, 18);

        popelmnt(stk);
        popelmnt(stk);

        try
        {
            popelmnt(stk);
        }
        catch (EmptyStackException e)
        {
            System.out.println("empty stack");
        }
    }
    //performing push operation
    static void pushelmnt(Stack stk, int x)
    {

        stk.push((x));
        System.out.println("push -: " + x);
        System.out.println("stack: " + stk);
    }

    static void popelmnt(Stack stk)
    {
        System.out.print("pop -> ");

        Integer x = (Integer) stk.pop();
        System.out.println(x);
        System.out.println("stack: " + stk);
    }
}
