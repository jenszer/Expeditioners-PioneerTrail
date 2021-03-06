/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.model;

import pioneertrail.model.Player;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jacob Enszer, Ariel George, Hector Mendoza
 */
public class Game implements Serializable {

    private int numPlayers;
    private int highScore;
    private Player Player;
    private ArrayList<Inventory> items = new ArrayList<>();
    private Map map;

    public Game() {
    }

    /*public ArrayList<Inventory> getItems() {
        return items;
    }

    public void setItems(ArrayList<Inventory> items) {
        this.items = items;
    }*/

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player Player) {
        this.Player = Player;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numPlayers;
        hash = 17 * hash + this.highScore;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "numPlayers=" + numPlayers + ", highScore=" + highScore + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.numPlayers != other.numPlayers) {
            return false;
        }
        if (this.highScore != other.highScore) {
            return false;
        }
        return true;
    }

    public Object getResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean gameOver;  

    public Game(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public ArrayList<Inventory> getItems() {
        return items;
    }

    public void setItems(ArrayList<Inventory> items) {
        this.items = items;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

}
