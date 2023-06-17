package com.string;

import com.exception.uncheckedexception.UnchekedException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrimExampleTest {
    TrimExample trimExample = new TrimExample();

    @Test
    public void should_return_Get_Optional_Trim() {
        Optional<String> optionalTrim = new TrimExample().getOptionalTrim("  abcdef    ");
       // assertTrue(optionalTrim.isPresent());
        assertEquals("abcdef", optionalTrim.get());
    }
    @Test
    public void should_return_Get_Optional_isEmpty() {
        Optional<Boolean>optionalBoolean = new TrimExample().getOptionalEmpty("");
       // assertTrue(optionalBoolean.isPresent());
        assertEquals(true,optionalBoolean.get());
    }
    @Test
    public void should_return_Get_Optional_equals(){
        Optional<Boolean>optionalEquals = new TrimExample().getOptionalEquals("java","java");
        assertEquals(true,optionalEquals.get());



    }
    @Test
    public void should_return_Get_Optional_equals_ignore_case(){
        Optional<Boolean>optional = new TrimExample().getOptionalEqualsIgnoreCase("java","JAVA");
        assertEquals(true,optional.get());

    }
    @Test
    public void should_return_Get_Optional_compare_to(){
        Optional<Integer>optionalCompareTo = new TrimExample().getOptionalCompareTo("INDIA IS MY COUNTRY","india is my country");
        assertEquals(-32,(int)optionalCompareTo.get());

    }
    @Test
    public void should_return_Get_Optional_compare_to_ignore_case(){
        Optional<Integer>optionalCompareToIgnoreCase = new TrimExample().getOptionalCompareToIgnoreCase("aB","AC");
        assertEquals(-1,(int)optionalCompareToIgnoreCase.get());

    }
    @Test
    public void should_return_Get_Optional_SubSequcence_string(){
        Optional<CharSequence>optionalSubSequcence = new TrimExample().getOptionalSubSequcence("this is demo");
          assertEquals("s is d",optionalSubSequcence.get());

    }

}





//    public void should_return_optional_character_At_passed_index(){
//        Optional<Character> optionalChartAtIndex = new UnchekedException().getOptionalChartAtIndex("abcd", 2);
//        assertTrue(optionalChartAtIndex.isPresent());
//        assertEquals('c',(char) optionalChartAtIndex.get());
//
//    }