package com.oops.abstraction;


import com.oops.Abstraction.Circle;
import com.oops.Abstraction.Draw;
import com.oops.Abstraction.Rectangle;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class AbstractionTest {
     Draw draw = new Draw();

    @Test
    void testCircle(){
        Circle circle = new Circle();
        assertEquals("draw circle",circle.draw());
    }

    @Test
    void testRectangle(){
        Rectangle rectangle = new Rectangle();
        assertEquals("draw rectangle",rectangle.draw());

    }



}
