/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.PioneerTrail;
import pioneertrail.control.MapControl;
import pioneertrail.model.Game;
import pioneertrail.model.Location;
import pioneertrail.model.Map;

/**
 *
 * @author Jacob Enszer
 */
public class MapView extends View{
    
    public MapView() {
          super(      "============================="
                + "\n Enter your desired location"
                + "\n=============================");
            }
    
    @Override
    public void display(){
        String leftIndicator;
        String rightIndicator;
        Game game = PioneerTrail.getGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        
        this.console.println(" |");
        for(int column = 0; column < locations[0].length; column ++){
            this.console.println(" " + column + " |");
        }
        this.console.println();
        for (int row = 0; row < locations.length; row++){
            this.console.println(row + "");
        
            for (int column = 0; column < locations[column].length; column++){
            leftIndicator = " ";
            rightIndicator = " ";
        
            if(locations[row][column] == locations[map.getCurrentRow()][map.getCurrentColumn()]){
            leftIndicator = "*";
            rightIndicator = "*";
            }
            else if(locations[row][column].isVisited()){
            leftIndicator = "<";
            rightIndicator = ">";
            }
            this.console.println("|");
            if(locations[row][column].getScene() == null){
                this.console.println(leftIndicator + "??" + rightIndicator);
            }
            else{
                this.console.println(leftIndicator
                + locations[row][column].getScene().getSceneSymbol()
                + rightIndicator);
            }
            }
            this.console.println("|");
    }
        }
    
    
    @Override
    public boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();
        Game game = PioneerTrail.getGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        for(int row = 0; row < locations.length; row++){
            for (int column = 0; column < locations[row].length; column++){
                if(locations[row][column].getScene() != null){
                    if(mapOption.equals(locations[row][column].getScene().getSceneSymbol())) {
                       MapControl.movePlayer(map,row,column);
                       return true;
                               }
                }
            }
        }
        ErrorView.display(this.getClass().getName(),
                "\n***Invalid selection***Try Again Later");
        return false;
       }
    


}
       
    

