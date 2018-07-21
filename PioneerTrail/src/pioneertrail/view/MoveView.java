/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import pioneertrail.PioneerTrail;
import pioneertrail.control.MapControl;
import pioneertrail.model.Game;
import pioneertrail.model.Map;


/**
 *
 * @author arielgeorge
 */
public class MoveView extends View {
       
    public MoveView() {
    super("==========="
        +"\nN - Next Location"
        +"\nV - View Map"
        +"\nQ - Return to Previous Menu");
    }
   
    Game game = PioneerTrail.getGame();
    Map map = game.getMap();
    

    public boolean doAction(String[] inputs) {
        String location = inputs[0].toUpperCase().trim();
        switch (location) {
            case "N":
                this.movePlayer();
                break;
            case "V":
                this.viewMap();
                break;
            }
        return true;
    }

    @Override
    public boolean doAction(String inputs) {
        return true;
    }
    
    public void movePlayer() {
        int row = map.getCurrentRow();
        int column = map.getCurrentColumn();
        MapControl.movePlayer(map, row, column);
        if (row < map.getRowCount()){
            row++;   
        }
        else if (column < map.getColumnCount()){
            column ++;
        }
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }
    
    public void viewMap() {
        MapView map = new MapView();
        map.display();
    }
    



}
