/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.model.Inventory;

/**a
 *
 * @author Jacob Enszer
 */

public class GameMenuView extends View {

    public GameMenuView() {
    }
       
    public String getMenu(){
        this.display();
        return null;
        }
   
    public String getUserInput(){
        String[] input = this.getInputs();
        return input[0];
    }


    @Override
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
            case "O":
                this.obstacleResolution();
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
        PurchaseSuppliesView purchaseSupplies = new PurchaseSuppliesView();
        purchaseSupplies.display();             
    }
    public void move(){
        System.out.println("Move Stub");
    }
    public void obstacleResolution(){
        ObstacleView obstacle = new ObstacleView();
        obstacle.display();
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
