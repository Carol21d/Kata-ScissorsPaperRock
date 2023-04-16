package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayersTest {
    private Player player1;
    private Player player2;

    public PlayersTest() {
        this.player1 = new Player(null);
        this.player2 = new Player(null);
    }

    @Test
    public void player1_play_with_rock() {

        Rock rock = player1.choose("Rock");
        assertEquals("Rock", rock.getType());

    }

    @Test 

    public void player2_play_with_scissors(){
         
        Scissors scissors = player2.choose2("Scissors");
        assertEquals("Scissors", scissors.getType());


    }

    @Test

    public void player_play_with_paper(){
         Paper paper = player1.choose3("Paper");
         assertEquals("Paper", paper.getType());
    }

}
