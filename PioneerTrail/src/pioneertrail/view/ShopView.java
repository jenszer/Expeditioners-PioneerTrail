/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.control.InventoryControl;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class ShopView {

    private Inventory shop;

    public ShopView() {
        this.shop = new Inventory();
        this.inventoryList(shop);
    }

    public Inventory getItems() {
        return shop;
    }
            
    private void addNewItem(Inventory shopItems, String name, String description, int price, boolean use_able, int amount) {
        Resource item = new Resource(name, description, price, use_able);
        item.setAmount(amount);
        InventoryControl.addItem(shopItems, item);
    }

    private void inventoryList(Inventory item) {
        addNewItem(item, "Food", "Food", 20, true, 50);
        addNewItem(item, "Water", "Water", 10, true, 50);
        addNewItem(item, "Wheel", "Spare Wheels", 50, true, 20);
        addNewItem(item, "Hammer", "Hammer", 25, true, 20);
        addNewItem(item, "Bullet", "Bullets", 2, true, 20);
    }
}
