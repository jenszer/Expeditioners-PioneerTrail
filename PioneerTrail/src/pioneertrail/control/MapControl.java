/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.model.Map;

/**
 *
 * @author Jacob Enszer
 */
public class MapControl {
            public static void movePlayer(Map map, int row, int column) {
            map.setLocations(map.getLocations()[row][colum]);
            map.getLocations().setVisited(true);
            map.setCurrentRow(row);
            map.setCurrentColumn(column);
        
    }
}
