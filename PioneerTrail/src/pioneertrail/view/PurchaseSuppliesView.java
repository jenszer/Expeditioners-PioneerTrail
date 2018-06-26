/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;

/**
 *
 * @author Hector Mendoza
 */
public class PurchaseSuppliesView extends View {

    public PurchaseSuppliesView() {
        super("\n F - Food"
                + "\n H - Hammer"
                + "\n S - Spare Wheels"
                + "\n B - Bullets"
                + "\n D - Drinking Water"
                + "\n Q - Quit");
    }

    Game game = new Game();

    private final ArrayList<Inventory> inventory = game.getItems();

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

        return 0;
    }

    public int purchaseAxe() {

        return 0;
    }

    public int purchaseHammer() {

        return 0;
    }

    public int purchaseSpareWheels() {

        return 0;
    }

    public int purchaseBullets() {

        return 0;
    }

    public int purchaseWood() {

        return 0;
    }

    public int purchaseDrinkingWater() {

        return 0;
    }

    public int huntResources() {
        String inputs = this.getInput("\nHow Many Bullets Would You"
                + "Like to Use?\n");
        int noBullets = Integer.parseInt(inputs);
        return 0;
    }

    public void viewInventory() {
        Inventory inventory = new Inventory();
        System.out.println(inventory.toString());
    }

}
