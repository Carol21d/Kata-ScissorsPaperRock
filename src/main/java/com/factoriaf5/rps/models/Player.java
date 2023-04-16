package com.factoriaf5.rps.models;

public class Player {
    //atributos
private String name;
private Figure figure;


//constructores
public Player(String name) {
    this.name = name;
}


//getters y setters
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}





//methods
public Rock choose(String string){
    if(string == "Rock"){
        return new Rock();
    }
    return null;
}


public Scissors choose2(String string){
     if(string =="Scissors"){
        return new Scissors();
     }
      return null;
}

public Paper choose3(String string){
    if(string == "Paper"){
        return new Paper();

    }
    return null;
}


public Figure getFigure() {
    return figure;
}


public void setFigure(Figure figure) {
    this.figure = figure;
}

}
