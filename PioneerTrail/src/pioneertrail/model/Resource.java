/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jacob Enszer
 */
public class Resource implements Serializable {

    private String name;
    private String type;
    private int amount;
    private int weight;
    private int price;
    public boolean use_able;
    private String description;

//    private Inventory Inventory;

    //public Resource() {
    //}

    public Resource(String name, String description, int price, boolean use_able) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.use_able = use_able;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isUse_able() {
        return use_able;
    }

    public void setUse_able(boolean use_able) {
        this.use_able = use_able;
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
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + this.amount;
        hash = 83 * hash + this.weight;
        hash = 83 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Resource{" + "name=" + name + ", type=" + type + ", amount=" + amount + ", weight=" + weight + ", description=" + description + '}';
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
        final Resource other = (Resource) obj;
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

    public int getPrice(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Resource getClone(){
        Resource clone = new Resource(this.name, this.description, this.price, this.use_able);
        clone.setAmount(0);
        return clone;
    }

}
