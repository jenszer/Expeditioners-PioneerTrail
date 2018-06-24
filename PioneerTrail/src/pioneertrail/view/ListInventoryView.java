/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.control.HarvestHuntControl;
import pioneertrail.model.Inventory;

/**
 *
 * @author Hector Mendoza
 */
public class ListInventoryView extends View{
    
    private final ArrayList<Inventory> inventories = new ArrayList<>();
    
    private final int resources = (int) (Math.random() * 8);

    public ListInventoryView(){
    }
    
    @Override
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
   
    @Override
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
