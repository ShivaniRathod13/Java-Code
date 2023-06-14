package com.oops.Polymorphism;

import junit.framework.TestCase;
import org.junit.Test;

public class OverridingTest extends TestCase {
    Overriding overriding  = new Overriding();
    Bank bank= new Bank();

    @Test
    public  void testSbi(){
      SBI sbi = new SBI();
        assertEquals(8,sbi.interest());
    }

    @Test
    public  void testHdfc(){
        HDFC hdfc = new HDFC();
        assertEquals(10,hdfc.interest());
    }

    @Test
    public  void testBoi(){
       BOI boi = new BOI();
        assertEquals(7,boi.interest());
    }

    @Test
    public  void testIcici(){
       ICICI icici = new ICICI();
        assertEquals(9,icici.interest());
    }



}