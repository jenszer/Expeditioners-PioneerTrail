/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jacob Enszer
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    public static void JacobEnszerTest(){
        public class Inventory implements Serializable{
        
            private String name;
            private String type;
            private int amount;
            private int weight;
            private String description;

        public Inventory() {
        }
            

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 29 * hash + Objects.hashCode(this.name);
            hash = 29 * hash + Objects.hashCode(this.type);
            hash = 29 * hash + this.amount;
            hash = 29 * hash + this.weight;
            hash = 29 * hash + Objects.hashCode(this.description);
            return hash;
        }

        @Override
        public String toString() {
            return "Inventory{" + "name=" + name + ", type=" + type + ", amount=" + amount + ", weight=" + weight + ", description=" + description + '}';
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
            final Inventory other = (Inventory) obj;
            if (this.amount != other.amount) {
                return false;
            }
            if (this.weight != other.weight) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            if (!Objects.equals(this.type, other.type)) {
                return false;
            }
            if (!Objects.equals(this.description, other.description)) {
                return false;
            }
            return true;
        }
        
            
        
        }
    }
    public static void TeamTest(){
}
}
        

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

        public class Player implements Serializable{
            
            private String name;
            private int highScore;
            private int age;
            private String gender;
            private int health;
            private int thirst;
            private int hunger;
            private ArrayList<Game> games = new ArrayList<Game>();

    public Player() {
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

   

   
            
            

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.highScore;
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.gender);
        hash = 97 * hash + this.health;
        hash = 97 * hash + this.thirst;
        hash = 97 * hash + this.hunger;
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", highScore=" + highScore + ", age=" + age + ", gender=" + gender + ", health=" + health + ", thirst=" + thirst + ", hunger=" + hunger + '}';
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
        final Player other = (Player) obj;
        if (this.highScore != other.highScore) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.thirst != other.thirst) {
            return false;
        }
        if (this.hunger != other.hunger) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }
             
            
        }
    
    public static void main(String[] args) {
       Player PlayerOne = new Player();
    TeamTest();
    JacobEnszerTest();
    
    }
    }