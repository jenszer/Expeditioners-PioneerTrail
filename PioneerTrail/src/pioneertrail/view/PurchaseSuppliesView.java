/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.PioneerTrail;
import pioneertrail.control.InventoryControl;
import pioneertrail.exceptions.WagonControlException;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Hector Mendoza
 */
public class PurchaseSuppliesView extends View {

    public PurchaseSuppliesView() {
        super("================"
                + "\n Purchase Items"
                + "\n================"
                + "\n F - Food"
                + "\n H - Hammer"
                + "\n S - Spare Wheels"
                + "\n B - Bullets"
                + "\n D - Drinking Water"
                + "\n Q - Quit");
        this.shop = new ShopView();
    }
    
    ShopView shop;
    Inventory inventory = PioneerTrail.getInventory();

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "F": {
                try {
                    this.purchaseFood();
                } catch (WagonControlException ie) {
                    this.console.println(ie.getMessage());
                    return true;
                }
            }
            break;

            case "H": {
                try {
                    this.purchaseHammer();
                } catch (WagonControlException ie) {
                    this.console.println(ie.getMessage());
                    return true;
                }
            }
            break;

            case "S": {
                try {
                    this.purchaseSpareWheels();
                } catch (WagonControlException ie) {
                    this.console.println(ie.getMessage());
                    return true;
                }
            }
            break;

            case "B": {
                try {
                    this.purchaseBullets();
                } catch (WagonControlException ie) {
                    this.console.println(ie.getMessage());
                    return true;
                }
            }
            break;

            case "D": {
                try {
                    this.purchaseDrinkingWater();
                } catch (WagonControlException ie) {
                    this.console.println(ie.getMessage());
                    return true;
                }
            }
            break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid Menu Item.");
                break;

        }
        return false;
    }
    
    private int makePurchase(String itemName, int purchaseAmount)
            throws WagonControlException {
        Resource shopItem = InventoryControl.findItem(shop.getItems(), itemName);
        
        InventoryControl.useItem(shop.getItems(), itemName, purchaseAmount);
        
        Resource item = shopItem.getClone();
        item.setAmount(purchaseAmount);
        InventoryControl.addItem(inventory, item);
        this.console.println("You've purchased "
                + item.getAmount() + " " + item.getName());
        return InventoryControl.getItemCount(inventory, item.getName());
    }

    public int purchaseFood()
            throws WagonControlException {
        return makePurchase("Food", 1);
    }

    public int purchaseAxe()
            throws WagonControlException {
        return makePurchase("Axe", 1);
    }

    public int purchaseHammer()
            throws WagonControlException {
        return makePurchase("Hammer", 1);
    }

    public int purchaseSpareWheels()
            throws WagonControlException {
        return makePurchase("Wheel", 1);
    }

    public int purchaseBullets()
            throws WagonControlException {
        return makePurchase("Bullet", 1);
    }

    public int purchaseWood()
            throws WagonControlException {
        return makePurchase("Wood", 1);
    }

    public int purchaseDrinkingWater()
            throws WagonControlException {
        return makePurchase("Water", 1);
    }

    public void viewInventory() {
        this.console.println(inventory.toString());
    }

}
