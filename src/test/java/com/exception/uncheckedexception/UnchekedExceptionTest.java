package com.exception.uncheckedexception;


import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnchekedExceptionTest {

    UnchekedException unchekedException = new UnchekedException();

    @Test
    public void should_return_character_At_passed_index(){
        assertEquals('c',new UnchekedException().getChartAtIndex("abcd",2));
    }
    @Test
    public void should_return_optional_character_At_passed_index(){
        Optional<Character> optionalChartAtIndex= new UnchekedException().getOptionalChartAtIndex("abcd", 2);
        assertTrue(optionalChartAtIndex.isPresent());
        assertEquals('c',(char) optionalChartAtIndex.get());

    }
    @Test
    public void should_return_string_length()
    {

        assertEquals(5,new UnchekedException().nullPointer("shivi"));
    }
    @Test(expected = NullPointerException.class)
    public void should_throw_null_pointer_exception(){
       new UnchekedException().nullPointer(null);

    }

    @Test
    public void should_return_empty_optional_character_At_passed_index(){
        Optional<Character> optionalChartAtIndex = new UnchekedException().getOptionalChartAtIndex("abcd", 4);
        assertTrue(optionalChartAtIndex.isEmpty());
    }
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void should_throw_string_index_out_of_bound_exception() {
        new UnchekedException().getChartAtIndex("ab", 2);
    }

    @Test

    public void should_divide_and_return_result() {
        assertEquals(4, new UnchekedException().divide(8, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void should_fail_due_to_divide_by_zero_exception() {
        new UnchekedException().divide(8, 0);
    }

    @Test
    public void testArrayOutOfBoundsException() {
        int s[] = {1, 2, 3};
        assertEquals("Index 3 out of bounds for length 3", unchekedException.arrayOutOfBoundsException(s));
    }

    @Test
    public void testArithmeticException() {
        assertEquals("/ by zero", unchekedException.arithmeticException(10, 0));
    }

    @Test
    public void testNullPointerException() {
        assertEquals("Cannot invoke \"String.length()\" because \"name\" is null", unchekedException.nullPointerException(null));

    }

    @Test
    public void testNumberFormatException() {
        assertEquals("For input string: \"abc\"", unchekedException.numberFormatException("abc"));
    }
}