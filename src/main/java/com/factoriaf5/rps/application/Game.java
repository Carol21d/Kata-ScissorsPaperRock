package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class Game {
    // atributos
    private String player1;
    private String player2;

    // constructores

    // getter y setter
    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // methods

    public String game_result(Figure player1, Figure player2){
     if (player1 instanceof Rock) {
        if (player2  instanceof Paper) {
            return "The player 2 wins with Paper";
        }
        if(player2 instanceof Scissors){
            return "The  player 1 wins with Rock";
        }

        if(player2 instanceof Rock){
            return null;
        }
       
    if(player1 instanceof Paper){
        if(player2 instanceof Rock){
            return "the player 1 wins with Paper";
        }

        if(player2 instanceof Scissors){
            return "The player 2 wins";
        }

        if(player2 instanceof Paper){
            return null;
        }
    }

    if(player1 instanceof Scissors){
        if(player2 instanceof Rock){
            return "The player 2  wins ";
        }

        if(player2 instanceof Paper){
            return "The player 1 wins with Scissors";
        }

        if(player2 instanceof Scissors){
            return null;
        }
    }
        
    if(player1 instanceof Lizard){
        if(player2 instanceof Rock){
            return "The player 2 with Rock";

        }

        if(player2 instanceof Paper){
            return "The player 1 with Lizard ";
        }

        if(player2 instanceof Scissors){
            return "The player 2 wins Scissors";
        }

        if(player2 instanceof Spock){
            return "The player 1 wins";
        }

        if(player2 instanceof Lizard){
            return null;
        }
    
    }

    if(player1 instanceof Spock){
        if(player2 instanceof Rock){
            return "The player 2 wins";
        }

        if(player2 instanceof Paper){
            return "The player 2 wins ";
        }
        if(player2 instanceof Scissors){
            return "The player 1 wins ";
        }

        if(player2 instanceof Lizard){
            return "The player 2 wins";
        }

        if(player2 instanceof Spock){
            return null;
        }
    }


     }
 
    
        return null;
 
    }
    }


   

    
