/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;


import pioneertrail.PioneerTrail;
import java.util.ArrayList;
import java.util.Scanner;
import pioneertrail.control.HarvestHuntControl;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;

/**
 *
 * @author Hector Mendoza
 */
public class PurchaseSuppliesView {
   
    public PurchaseSuppliesView(){
    }
    
        Game game = new Game();
        
        private ArrayList<Inventory> inventory = game.getItems();

            
    public void display(){
        System.out.println("Please select an option to purchase supplies:");
           
        boolean endOfView = false;
           
        do{
            System.out.println("\n F - Food"
                    + "\n H - Hammer"
                    + "\n S - Spare Wheels"
                    + "\n B - Bullets"
                    + "\n D - Drinking Water"
                    + "\n Q - Quit");
                    
            String[] inputs = this.getInputs();
        
        
            if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
            break;
            }
            else{     
            endOfView = doAction(inputs);
        }
        }
        while (endOfView != true);
        return;
        }
   
    public String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("PURCHASE SUPPLIES MENU");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Make your selection: ");
           Scanner userInput = new Scanner(System.in);
           inputs[0] = userInput.nextLine();
                                                       
           if(inputs[0].trim().equals("") == true){
           System.out.println("You must enter a non-blank value");
           continue;
           }           
                      
           valid = true;
        }
        return inputs;
    }
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        
       switch (menuItem){
            case "F":
                this.purchaseFood();
                break;
            case "H":
                this.purchaseHammer();
                break;
            case "S":
                this.purchaseSpareWheels();
                break;
            case "B":
                this.purchaseBullets();
                break;
            case "D":
                this.purchaseDrinkingWater();
                break;
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
    public int purchaseFood(){
        
        
        
        return 0;
    }
    
    public int purchaseAxe(){
        
        return 0;
    }
    
    public int purchaseHammer(){
        
        return 0;
    }
    
    public int purchaseSpareWheels(){
        
        return 0;
    }
    
    public int purchaseBullets(){
        
        return 0;
    }
    
    public int purchaseWood(){
        
        return 0;
    }
    
    public int purchaseDrinkingWater(){
        
        return 0;
    }
    
    public int huntResources(){
            System.out.println("\nHow Many Bullets Would You"
                            + "Like to Use?\n");
            String[] inputs = this.getInputs();
            int noBullets = Integer.parseInt(inputs[0]);
            //int weight = HarvestHuntControl.calcHuntForResources(resources, noBullets);
            //System.out.println("You gathered " + weight + "lbs of resources");
            //return weight;
            return 0;
        }
    
    public void viewInventory(){
       Inventory inventory = new Inventory();
       System.out.println(inventory.toString());
    }
    
}