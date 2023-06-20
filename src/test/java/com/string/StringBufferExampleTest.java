package com.string;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringBufferExampleTest  {
    StringBufferExample stringBufferExample = new StringBufferExample();
    @Test
    public void should_return_Get_Optional_capacity_string(){
        Optional<Integer>optionalInteger=new StringBufferExample().returncapacityString();
        assertEquals(34,(int) optionalInteger.get());
    }

   @Test
    public void should_return_Get_Optional_append_string(){
        Optional<StringBuffer>optionalStringBuffer=new StringBufferExample().getOptionalReturnAppend();
        assertEquals("Hello java",optionalStringBuffer.get().toString());
    }

    @Test
    public void should_return_equals_string(){
        Optional<Boolean>optionalBoolean = new StringBufferExample().equalsString();

       assertEquals(false,optionalBoolean.get());
    }

}
