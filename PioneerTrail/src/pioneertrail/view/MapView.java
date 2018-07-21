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
public class MapView extends View {

    public MapView() {
        super("============================="
                + "\n Enter your desired location"
                + "\n=============================");
    }

    @Override
    public void display() {
        String leftIndicator;
        String rightIndicator;
        Game game = PioneerTrail.getGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();

        this.console.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            this.console.print(" " + (column + 1) + "  |");
        }
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            Location[] locationRow = locations[row];
            this.console.print((row + 1) + " ");

            for (int column = 0; column < locationRow.length; column++) {
                Location location = locationRow[column];
                leftIndicator = " ";
                rightIndicator = " ";

                if (row == map.getCurrentRow() && column == map.getCurrentColumn()) {
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (location.isVisited()) {
                    leftIndicator = "<";
                    rightIndicator = ">";
                }
                this.console.print("|");
                if (location.getScene() == null) {
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator
                            + location.getScene().getSceneSymbol()
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

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {
                    if (mapOption.equals(locations[row][column].getScene().getSceneSymbol())) {
                        MapControl.movePlayer(map, row, column);
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
