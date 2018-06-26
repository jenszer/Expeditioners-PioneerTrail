/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.control.HarvestHuntControl;
import pioneertrail.model.Inventory;

/**
 *
 * @author Hector Mendoza
 */
public class ListInventoryView extends View {

    private final ArrayList<Inventory> inventories = new ArrayList<>();

    private final int resources = (int) (Math.random() * 8);

    public ListInventoryView() {
        super("\n H - Hunt"
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

    public int huntResources() {
        String inputs = this.getInput("\nHow Many Bullets Would You"
                + "Like to Use?\n");
        int noBullets = Integer.parseInt(inputs);
        int weight = HarvestHuntControl.calcHuntForResources(resources, noBullets);
        System.out.println("You gathered " + weight + "lbs of resources");
        return weight;

    }

    public void viewInventory() {
        Inventory inventory = new Inventory();
        System.out.println(inventory.toString());
    }

}
