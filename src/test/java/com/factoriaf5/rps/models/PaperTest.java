package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {
    @Test
    public void paper_is_paper() {
        Paper paper = new Paper();
        assertEquals("Paper", paper.getType());

    }

  
}
