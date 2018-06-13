/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.Scanner;
import pioneertrail.PioneerTrail;
import pioneertrail.control.HarvestHuntControl;
import pioneertrail.model.Inventory;

/**
 *
 * @author Jacob Enszer
 */
public class HuntForResourcesView {

    private int resources = (int) (Math.random() * 8);

    public HuntForResourcesView(){
    }
    
    public void display(){
        System.out.println("There is/are " + resources + " resources at this location."); 
           
        boolean endOfView = false;
           
        do{    
        
        if(resources == 0){
        break;
        }         
        else {
            System.out.println("\n H - Hunt"
                    + "\n V - View Inventory"
                    + "\n Q - Exit to Previous Menu");
                    
            String[] inputs = this.getInputs();
        
        
            if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
            break;
            }
            else{     
            endOfView = doAction(inputs);
            }
        }
        }
        while (endOfView != true);
        return;
        }
   
    public String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("HUNT RESOURCES MENU");
        
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
            case "H": 
                this.huntResources();
                break;
            case "V":
                this.viewInventory();
                break;
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
    public int huntResources(){
            System.out.println("\nHow Many Bullets Would You"
                            + "Like to Use?\n");
            String[] inputs = this.getInputs();
            int noBullets = Integer.parseInt(inputs[0]);
            int weight = HarvestHuntControl.calcHuntForResources(resources, noBullets);
            System.out.println("You gathered " + weight + "lbs of resources");
            return weight;
            
        }
    public void viewInventory(){
       Inventory inventory = new Inventory();          
       System.out.println(inventory.toString());
    }
 
}
