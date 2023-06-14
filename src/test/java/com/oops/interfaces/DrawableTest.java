package com.oops.interfaces;

import com.oops.Interface.Circle;
import com.oops.Interface.Interface;
import com.oops.Interface.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrawableTest {
    Interface anInterface = new Interface();

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle();
        assertEquals("drawing rectangle", rectangle.draw());

    }

    @Test

    public void testCircle(){
        Circle circle = new Circle();
        assertEquals("drawing circle",circle.draw());
    }



}
