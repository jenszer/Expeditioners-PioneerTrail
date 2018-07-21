/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.exceptions.WagonControlException;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class InventoryControl {

    public static void addItem(Inventory inventory, Resource resource) {
        Resource item = InventoryControl.findItem(inventory, resource);
        
        if (item == null){
            inventory.getResources().add(resource);
        }
        else {
            item.setAmount(
                    item.getAmount() + resource.getAmount()
            );
        }
    }
    
    public static Resource findItem(Inventory inventory, String itemName) {
        for (Resource item : inventory.getResources()) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public static Resource findItem(Inventory inventory, Resource resource) {
        return findItem(inventory, resource.getName());
    }

    public static int getItemCount(Inventory inventory, String itemName) {
        Resource item = findItem(inventory, itemName);
        if (item == null) {
            return 0;
        }
        return item.getAmount();
    }

    public static void useItem(Inventory inventory, String itemName, int amount) throws WagonControlException {
        Resource item = findItem(inventory, itemName);
        
        if (item == null || item.getAmount() < amount) {
            throw new WagonControlException("Not enough " + itemName + " in inventory");
        }
        int newAmount = item.getAmount() - amount;
        
        if(newAmount == 0){
            inventory.getResources().remove(item);
        }
        else {
            item.setAmount(newAmount);
        }
    }

    public static Resource takeItem(Inventory inventory, String itemName) {
        Resource item = findItem(inventory, itemName);
        
        if (item == null) {
            return null;
        }
        
        if (item.getAmount() == 0) {
            inventory.getResources().remove(item);
            item = null;
        }
        return item;
    }
/*
    public int addItem(Resource resource) {
        Inventory item = findItem(resource);
        if (item == null) {
            this.add(new Inventory(resource, 1));
            return 1;
        } else {
            return item.getAmount();
        }
    }
    /* public ArrayList<Resource> getResources(){
       
        for (int i = 0; i < ArrayList<Resource>.size(); i++){
            
            amount = amount.getAmount(i)
                       
            Inventory total = cost * item;

    }
        return item;
    } */

}
