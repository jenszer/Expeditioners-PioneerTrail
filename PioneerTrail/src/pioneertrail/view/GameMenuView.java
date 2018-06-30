/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.model.Inventory;

/**
 * a
 *
 * @author Jacob Enszer
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super(      "==========="
                + "\n Game Menu"
                + "\n==========="
                + "\nV - View Map"
                + "\nI - View Inventory"
                + "\nP - Purchase Supplies"
                + "\nM - Move"
                + "\nO - Obstacle Resolution"
                + "\nH - Hunt for Resources"
                + "\nS - Save Game"
                + "\nZ - Get Help"
                + "\nQ - Return to Main Menu");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
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

    public void viewMap() {
        MapView map = new MapView();
        map.display();
        
    }

    public void viewInventory() {
        Inventory inventory = new Inventory();
        System.out.println(inventory.toString());

    }

    public void purchaseSupplies() {
        PurchaseSuppliesView purchaseSupplies = new PurchaseSuppliesView();
        purchaseSupplies.display();
    }

    public void move() {
        System.out.println("Move Stub");
    }

    public void obstacleResolution() {
        ObstacleView obstacle = new ObstacleView();
        obstacle.display();
    }

    public void huntForResources() {
        HuntForResourcesView huntResources = new HuntForResourcesView();
        huntResources.display();
    }

    public void saveGame() {
        System.out.println("Save Game Stub");
    }

    public void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
