/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;



/**
 *
 * @author Jacob Enszer, Hector Mendoza, Ariel George
 */
public class PioneerTrail {

    
    public static void main(String[] args) {
       Player playerOne = new Player();
       Inventory inventoryItem = new Inventory();
       Resource resource = new Resource();
    
        playerOne.setName("Brigham Young");
        playerOne.setHealth(100);

        String playerOneName = playerOne.getName();
        int playerOneHealth = playerOne.getHealth();   
          
        System.out.println("Name = " + playerOneName +
                       ", Health = " + playerOneHealth);
               
        String actorFatherName = Actor.Father.getName();
        String actorFatherDescription = Actor.Father.getDescription(); 
        
        System.out.println(actorFatherName + ", " + actorFatherDescription);
    
        inventoryItem.setName("Axe");
        inventoryItem.setWeight(5);
        
        String inventoryItemName = inventoryItem.getName();
        int inventoryWeight = inventoryItem.getWeight();
        
        System.out.println("Inventory: " + inventoryItemName + "; Weight: " +
                        inventoryWeight);
        
        resource.setName("Water");
        resource.setAmount(15);
        
        String resourceName = resource.getName();
        int resourceAmount = resource.getAmount();
        
        System.out.println("Resource: " + resourceName + "; Amount: " +
                        resourceAmount);
    }
}