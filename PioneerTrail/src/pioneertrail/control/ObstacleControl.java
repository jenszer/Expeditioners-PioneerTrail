/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

public class ObstacleControl {
      
    public static int calcMortality(int mortalityRate, int noFood, int noWater, int noRest){
        int resourceUse;
        float deathRate;
        int death;
               
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
        deathRate =  (float) mortalityRate / resourceUse;
        
        if(deathRate >= .5){
            return 1;
        }
        else{
            return 0;
        }
    }
        
    }