/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.exceptions.ObstacleControlException;

public class ObstacleControl {
      
    public static int calcMortality(int mortalityRate, int noFood, 
            int noWater, int noRest) throws ObstacleControlException{
        int resourceUse;
        float deathRate;
        int death;
               
        if (noWater < 1){ 
            throw new ObstacleControlException("You must use at least 1 water");
        }    
        if (noFood < 1){
            throw new ObstacleControlException("You must use at least 1 food");
        }
        if(noRest < 1){
            throw new ObstacleControlException("You must use at least 1 rest");
        }
       
        resourceUse = noRest + noFood + noWater;
        deathRate =  (float) mortalityRate / resourceUse;
        
        if(deathRate >= .5){
            death = 1;
            System.out.println("You have lost a member of your party");
            return death;
        }
        else{
            death = 0;
            System.out.println("You've saved your party member");
            return death;
        }
    }
    
    public static void fixWagon(int Wheels) 
            throws ObstacleControlException{
        if (Wheels < 1){
            throw new ObstacleControlException("You must use at least 1 wheel");        }
       
        else {
            System.out.println("You've fixed your wagon");
        } 
    }
}