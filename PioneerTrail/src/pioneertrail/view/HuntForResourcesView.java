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
                this.huntResources();
                break;
            case "V":
                this.viewInventory();
                break;
            default:
                System.out.println("\nInvalid Menu Item.");
                break;
        }
        return false;
    }

    public int huntResources() throws HarvestHuntControlException {
        String inputs = this.getInput("\nThere is/are " + resources + " resources at this location."
                + "\nHow Many Bullets Would You"
                + "Like to Use?\n");
        int noBullets = Integer.parseInt(inputs);
        int weight = HarvestHuntControl.calcHuntForResources(resources, noBullets);
        try{
        HarvestHuntControl.calcHuntForResources(resources, noBullets);
        } catch (HarvestHuntControlException ie){
            System.out.println(ie.getMessage());
        }
        
        System.out.println("You gathered " + weight + "lbs of resources");
        return weight;

    }

    public void viewInventory() {
        Inventory inventory = new Inventory();
        System.out.println(inventory.toString());
    }

}
