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
Father("Micheal", "Description of character.", new Point(1,1)),
Mother("Karen", "Description of character.", new Point(2,3)),
Son("John", "Description of character.", new Point(3,4)),
Daughter("Mary", "Description of character.", new Point(3,5));

private String name;
private String description;
private String type;
private String gender;
private Point coordinates;

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

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", type=" + type + ", gender=" + gender + ", coordinates=" + coordinates + '}';
    }
    
}
