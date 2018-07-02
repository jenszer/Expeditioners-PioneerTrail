/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Hector Mendoza
 */
public class PurchaseSuppliesView extends View {

    public PurchaseSuppliesView() {
        super(      "================"
                + "\n Purchase Items"
                + "\n================"
                + "\n F - Food"
                + "\n H - Hammer"
                + "\n S - Spare Wheels"
                + "\n B - Bullets"
                + "\n D - Drinking Water"
                + "\n Q - Quit");
            }

    Game game = new Game();

    ArrayList<Inventory> inventory = game.getItems();


    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
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

    public int purchaseFood() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Food");
        return 0;
    }

    public int purchaseAxe() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Axe");
    return 0;
    }
    public int purchaseHammer() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Hammer");
        return 0;
    }

    public int purchaseSpareWheels() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Wheel");
        return 0;
    }

    public int purchaseBullets() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Bullet");
        return 0;
    }

    public int purchaseWood() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Wood");
        return 0;
    }

    public int purchaseDrinkingWater() {
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Water");
        return 0;
    }

    public void viewInventory() {
        System.out.println(inventory.toString());
    }

}
