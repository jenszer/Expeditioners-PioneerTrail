/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import java.awt.Point;
        
/**
 *
 * @author Mauricio
 */
public enum Actor {
Father("Micheal", "Greatest Dad in the World.", new Point(1,1)),
Mother("Karen", "Greatest Mom in the World.", new Point(2,3)),
Son("John", "Rebellious Teen, but still a good kid.", new Point(3,4)),
Daughter("Mary", "Energetic 9yr old, going on 16.", new Point(3,5));

private String name;
private String description;
private String type;
private String gender;
private Point coordinates;

private Player Player;

Actor(String name, String description, Point coordinates) {
    this.name = name;
    this.description = description;
    this.coordinates = coordinates;
}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public Player getPlayer() {
        return Player;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", type=" + type + ", gender=" + gender + ", coordinates=" + coordinates + '}';
    }
    
}
