package com.oops.constructor;

import junit.framework.TestCase;
import org.junit.Test;

public class RectangleTest extends TestCase {

     @Test
    public void testGetWidth() {
         Rectangle rectangle = new Rectangle(5, 10);
         assertEquals(5,rectangle.getWidth());
     }


    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(10,rectangle.getHeight());
    }
    @Test
    public void testCalculateArea() {


        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50,rectangle.calculateArea());

    }






}