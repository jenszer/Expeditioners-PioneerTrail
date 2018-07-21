/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.model;

import pioneertrail.model.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jacob Enszer
 */
public class Inventory implements Serializable {

    private String name;
    private String type;
    private int amount;
    private int weight;
    private String description;
    private Game Game;
    private ArrayList<Resource> resources = new ArrayList<Resource>();

    public Inventory(Resource resource, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Inventory() {
    }
    
    public Game getGame() {
        return Game;
    }

    public void setGame(Game Game) {
        this.Game = Game;
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }

    public void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
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
        String output = "Inventory{" + "name=" + name + ", type=" + type + ", amount=" + amount + ", weight=" + weight + ", description=" + description + '}';
        output = resources.stream().map((item) -> "\n" + item.toString()).reduce(output, String::concat);
        return output;
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

    public Inventory getAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
