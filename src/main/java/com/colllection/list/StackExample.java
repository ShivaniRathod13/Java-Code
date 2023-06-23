package com.colllection.list;

import java.util.EmptyStackException;
import java.util.Optional;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push("BMW");
//        stack.push("BMW");
//        stack.push("Audi");
//        stack.push("Ferrari");
//        stack.push("Bugatti");
//        stack.push("Jaguar");
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//       // System.out.println(stack.empty());
//        try
//        {
//            stack.pop();
//        }
//        catch (EmptyStackException e)
//        {
//            System.out.println("empty stack");
//        }
//        System.out.println(stack.push("furniture"));


    }
    public Optional<Stack<String>> getStackElement() {
        Stack<String> stack = new Stack<>();
        stack.push("BMW");
        stack.push("BMW");
        stack.push("Audi");
        stack.push("Ferrari");
        stack.push("Bugatti");
        stack.push("Jaguar");

        return Optional.of(stack);
    }
}
