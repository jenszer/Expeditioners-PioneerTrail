/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.model;

/**
 *
 * @author arielgeorge
 */
public class Wagon {

    public Wagon() {
    }

    private int currentWeight;

    /**
     * Get the value of currentWeight
     *
     * @return the value of currentWeight
     */
    public int getCurrentWeight() {
        return currentWeight;
    }

    /**
     * Set the value of currentWeight
     *
     * @param currentWeight new value of currentWeight
     */
    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    private int maxWeight;

    /**
     * Get the value of maxWeight
     *
     * @return the value of maxWeight
     */
    public int getMaxWeight() {
        return maxWeight;
    }

    /**
     * Set the value of maxWeight
     *
     * @param maxWeight new value of maxWeight
     */
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

}
