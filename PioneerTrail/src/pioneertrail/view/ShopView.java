/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class ShopView {
    private Inventory shop;
    
    public ShopView(){
        this.shop = new Inventory();
        this.inventoryList(shop);
    }
    
    private void addNewItem(Inventory item, String name, String 
            description, int price, boolean use_able, int amount){     
        item.setResources(new Inventory(new Resource(name,description,
                price, use_able), amount));
    }
    
    private void inventoryList(Inventory item){
        addNewItem(item, "Food", "Food", 20, true, 0);
        addNewItem(item, "Water", "Water", 10, true, 0);
        addNewItem(item, "Wheel", "Spare Wheels", 50, true, 0);
        addNewItem(item, "Hammer", "Hammer", 25, true, 0);
        addNewItem(item, "Bullet", "Bullets", 2, true, 0);   
    }
}

