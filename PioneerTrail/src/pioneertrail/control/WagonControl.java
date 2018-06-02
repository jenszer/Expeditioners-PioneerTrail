/*
 */
package pioneertrail.control;

import pioneertrail.model.Inventory;
import pioneertrail.model.Wagon;

/**
 *
 * @author Ariel George
 */
public class WagonControl {
    


    
    public static int calcRemainingWeight(Wagon wagon, Inventory inventoryItem){
        
        if (inventoryItem.getAmount() < 1){ 
        return -3;
        }      
        if (inventoryItem.getWeight() < 1){
        return -4;
        }
        if(wagon.getCurrentWeight() < 0){
        return -5;
        }
        if(wagon.getCurrentWeight() >= wagon.getMaxWeight()){
        return -1;
        }       
        if(wagon.getCurrentWeight() +(inventoryItem.getAmount() *inventoryItem.getWeight()) > wagon.getMaxWeight()){
        return -2;
        }  
        wagon.setCurrentWeight(wagon.getCurrentWeight() + inventoryItem.getAmount() * inventoryItem.getWeight());
        return wagon.getCurrentWeight();
    }
}
