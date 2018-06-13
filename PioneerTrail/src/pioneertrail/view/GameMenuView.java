/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.Scanner;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class GameMenuView {

    public GameMenuView() {
    }
    
    public void display(){
        boolean endOfView = false;
        String inputs[];
                           
        do {
        
        System.out.println("\n V - View Map"
                    + "\n I - View Inventory"
                    + "\n P - Purchase Supplies"
                    + "\n M - Move to New Location"
                    + "\n R - Repair Wagons"
                    + "\n H - Hunt for Resources"               
                    + "\n S - Save Game"
                    + "\n Z - Help"                 
                    + "\n Q - Exit to Previous Menu");
        inputs = this.getInputs();
        
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
        System.out.println("GAME MENU");
        
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
            case "V": 
                this.viewMap();
                break;
            case "I":
                this.viewInventory();
                break;
            case "P":
                this.purchaseSupplies();
                break;
            case "M":
                this.move();
                break; 
            case "R":
                this.repairWagon();
                break;                 
            case "H":
                this.huntForResources();
                break;                 
            case "S":
                this.saveGame();
                break;                 
            case "Z":
                this.getHelp();
                break; 
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
    public void viewMap(){
        System.out.println("View Map Stub");
            }
    public void viewInventory(){
       Inventory inventory = new Inventory();          
       System.out.println(inventory.toString());
          
    }
    public void purchaseSupplies(){
        System.out.println("Purchase Supplies Stub");
    }
    public void move(){
        System.out.println("Move Stub");
    }
    public void repairWagon(){
        System.out.println("Repair Wagon Stub");
    }
    public void huntForResources(){
        HuntForResourcesView huntResources = new HuntForResourcesView();
        huntResources.display();
    }
    public void saveGame(){
        System.out.println("Save Game Stub");
    }
    public void getHelp(){
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        }
}
