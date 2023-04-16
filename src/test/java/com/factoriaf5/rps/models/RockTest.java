package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void rock_is_rock() {
        Rock rock = new Rock();
        assertEquals("Rock",rock.getType());
        assertTrue(true);

        
    }
}
