/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

/**
 *
 * @author Jacob Enszer
 */
public class ObstacleControl {
    
    public static int calcMortality(int mortalityRate, int noFood, int noWater, int noRest){
        int resourceUse;
        int deathRate;
        int death = 0;
        
        if (noWater < 1){ 
        return -1;
        }      
        if (noFood < 1){
        return -2;
        }
        if(noRest < 1){
        return -3;
        }
       
        resourceUse = noRest + noFood + noWater;
        deathRate = mortalityRate / resourceUse;
                      
        /**if (sicknessType = "fever"){
            mortalityRate = 2;
            resourceUse = noRest + noFood;
            deathRate = mortalityRate/resourceUse;
        else (sicknessType = "hypothermia") 
            mortalityRate = 3;
            resourceUse = noFood + noRest;
            deathRate = mortalityRate/resourceUse;
        else (sicknessType = "snakeBite") 
            mortalityRate = 4;
            resourceUse = noWater + noRest;
            deathRate = mortalityRate/resourceUse;
        else (sicknessType = "brokenBone") 
            mortalityRate = 5;
            resourceUse = noRest + noWater;
            deathRate = mortalityRate/resourceUse;**/
        if(deathRate >= .5){
            death = 1;
            return death;
        }
       return death;
    }
}
