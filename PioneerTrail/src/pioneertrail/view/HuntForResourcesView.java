/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.control.HarvestHuntControl;
import pioneertrail.exceptions.HarvestHuntControlException;
import pioneertrail.model.Inventory;

/**
 *
 * @author Jacob Enszer
 */
public class HuntForResourcesView extends View {

    private final int resources = (int) (Math.random() * 8);

    public HuntForResourcesView() {

        super(      "==========="
                + "\n Hunt Menu"
                + "\n==========="
                + "\n H - Hunt"
                + "\n V - View Inventory"
                + "\n Q - Exit to Previous Menu");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "H":
        {
            try {
                this.huntResources();
            } catch (HarvestHuntControlException ie) {
               System.out.println(ie.getMessage());
               return true;
            }
        }
                break;
            case "V":
                this.viewInventory();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid Menu Item.");
                break;
        }
        return false;
    }

    public int huntResources() throws HarvestHuntControlException{
        String inputs = this.getInput("\nThere is/are " + resources + " resources at this location."
                + "\nHow Many Bullets Would You"
                + "Like to Use?\n");
        int noBullets = Integer.parseInt(inputs);
        try{
         Integer.parseInt(inputs);
       } catch (NumberFormatException ie){
        System.out.println(ie.getMessage());
     }
               
        int weight = HarvestHuntControl.calcHuntForResources(resources, noBullets);
        
        System.out.println("You gathered " + weight + "lbs of resources");
        return weight;

    }

    public void viewInventory() {
        Inventory inventory = new Inventory();
        System.out.println(inventory.toString());
    }

}
