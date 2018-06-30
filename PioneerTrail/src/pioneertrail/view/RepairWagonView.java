/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.PioneerTrail;
import pioneertrail.model.Resource;

/**
 *
 * @author arielgeorge
 */
public class RepairWagonView extends View {

    public RepairWagonView() {
    }

    public boolean doAction(String[] inputs) {
        return false;
    }
    
    
    @Override
    public void display(){
        
        System.out.println("Your Wagon Has Been Wrecked. :(");
        
        System.out.println("You lost a wheel :(");
        
        System.out.println("Resources needed to repair: ");
        PioneerTrail pt = new PioneerTrail();
        //pt.listItems(pt.getPlayer().getActors().get(0).getInventory());
    }

    public void listItems(ArrayList<Resource>  items) {
        for (int i = 0; i < items.size(); i++){
            
            System.out.println(items.get(i).getName() + '\n');
        }
        
    }

    @Override
    public boolean doAction(String inputs) {
        return false;
    }
}
