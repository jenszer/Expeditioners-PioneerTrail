/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;
import pioneertrail.model.ItemType;
import pioneertrail.model.Resource;

/**
 *
 * @author Hector Mendoza
 */
public class ListInventoryView extends View {
    Game game = new Game();
    private final ArrayList<Inventory> inventory = game.getItems();

    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    