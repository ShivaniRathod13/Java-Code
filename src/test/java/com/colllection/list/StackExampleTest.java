package com.colllection.list;

import com.exception.uncheckedexception.UnchekedException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackExampleTest {
    StackExample stackExample = new StackExample();
    Stack<String> stack = new Stack<>();
    Optional<Stack<String>> list =stackExample.getStackElement();

    @Test
    public void should_get_optional_stack_element() {
        Optional<Stack<String>> optionalStack = new StackExample().getStackElement();
        assertTrue(optionalStack.isPresent());

        Stack<String> stack = optionalStack.get();

        assertEquals("Jaguar", stack.pop());
        assertEquals("Bugatti", stack.pop());
        assertEquals("Ferrari", stack.pop());
        assertEquals("Audi", stack.pop());
        assertEquals("BMW", stack.pop());
        assertEquals("BMW", stack.pop());

        assertTrue(String.valueOf(stack.isEmpty()),true);
    }

//    @Test
//    public void should_get_optional_pop_element() {
//        assertEquals("Ciaz", stack.pop());
//    }
}