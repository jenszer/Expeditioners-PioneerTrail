/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.PioneerTrail;
import pioneertrail.model.Player;

/**
 *
 * @author Jacob Enszer
 */
public class GameControl {
    
    public static Player savePlayer(String playerName) {
        Player player = new Player();
        player.setName(playerName);
        PioneerTrail.setPlayer(player);
        return new Player();
    }   
    public static void createNewGame(Player player){
            System.out.println("Stub");
            }
    
   // public static Player createNewGame(String )
}
