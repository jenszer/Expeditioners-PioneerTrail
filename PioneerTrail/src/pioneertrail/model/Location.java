/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.model;

import java.io.Serializable;

/**
 *
 * @author Ariel George
 */
public class Location implements Serializable {

    private int row;
    private int column;
    private int milesRemaining;
    private boolean visited;
    private Scene scene;

    private Map map;

    public Location() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Map getMap() {
        return map;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getMilesRemaining() {
        return milesRemaining;
    }

    public void setMilesRemaining(int milesRemaining) {
        this.milesRemaining = milesRemaining;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.column;
        hash = 89 * hash + this.milesRemaining;
        hash = 89 * hash + (this.visited ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", milesRemaining=" + milesRemaining + ", visited=" + visited + '}';
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.milesRemaining != other.milesRemaining) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

}
