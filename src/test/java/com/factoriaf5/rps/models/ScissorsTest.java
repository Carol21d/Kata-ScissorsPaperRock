package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScissorsTest {
    @Test
    public void scissors_is_scissors() {
        Scissors scissors = new Scissors();
        assertEquals("Scissors", scissors.getType());

    }

    
}
