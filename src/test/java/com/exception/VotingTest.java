package com.exception;

import junit.framework.TestCase;
import org.junit.Test;

public class VotingTest extends TestCase {


    @Test
    public void testValidateIneligibleAge() {
        Voting voting = new Voting();
        assertEquals("you are not eligible for voting", voting.validate(13));
    }
}