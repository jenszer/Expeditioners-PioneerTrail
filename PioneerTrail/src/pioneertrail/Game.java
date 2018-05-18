/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

/**
 *
 * @author Jacob Enszer
 */
public class Game implements Serializable{
            
        private int numPlayers;
        private int highScore;
        private Player Player;

    public Game() {
    }

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
            
            
            
        }
