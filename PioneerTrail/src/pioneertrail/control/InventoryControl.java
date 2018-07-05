/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import java.util.ArrayList;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class InventoryControl extends ArrayList<Inventory>{
    private Inventory findItem(String itemName){
        for(Inventory item : this){
            if(item.getName().equals(itemName))
                
                return item;
        }
        return null;
    }
    public Inventory findItem(Resource resource){
        return findItem(resource.getName());      
    } 
    public int getItemCount(Resource resource){
        Inventory item = findItem(resource);
        if(item==null) {
            return 0;
        }
        return item.getAmount();
    }
    public Resource takeItem(Resource resource){
        Inventory item = findItem(resource);
        if(item==null){
            return null;
        }
        item.getAmount();
        if(item.getAmount()==0){
            this.remove(item);
        }
        return resource;   
    }
    public int addItem(Resource resource){
        Inventory item = findItem(resource);
        if(item==null){
            this.add(new Inventory(resource, 1));
            return 1;
        }
        else {
            return item.getAmount();
        }
    }
    public Inventory inventoryTotal(Inventory item, Inventory amount){
       
        for (int i = 0; i < item.size(); i++){
            item = item.getAmount(i);
            Inventory qty;
            qty = item.getAmount(i);
            Resource resource = new Resource();
            int cost = resource.getPrice(i);
            Inventory total = cost * qty;

        
    }
        return item;
    } 
            
}
