/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;



/**
 *
 * @author Jacob Enszer
 */
public class PioneerTrail {

    
    public static void main(String[] args) {
       Player playerOne = new Player();
    
        playerOne.setName("Fred Flinstone");
        playerOne.setHealth(100);

        String playerOneName = playerOne.getName();
        int playerOneHealth = playerOne.getHealth();

        System.out.println("Name = " + playerOneName +
                       ", health = " + playerOneHealth);
    
    }
}