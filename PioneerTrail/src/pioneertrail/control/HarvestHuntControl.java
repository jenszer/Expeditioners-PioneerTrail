/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class HarvestHuntControl {
       
    public static int calcHuntForResources(int noElk, int noBullets){
        if (noElk < 1){ 
        return -1;
        }      
        if (noBullets < 1 || noBullets > 20){
        return -2;
        }
        if(noBullets >= noElk){
        int weight = noElk * 50;
        return weight;
        }
        else { 
        int weight = (noElk - (noElk - noBullets)) * 50; 
        return weight;
        }
    }
}