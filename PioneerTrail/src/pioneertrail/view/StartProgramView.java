package pioneertrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import pioneertrail.PioneerTrail;
import pioneertrail.control.GameControl;
import pioneertrail.model.Player;


/**
 *
 * @author arielgeorge
 */
public class StartProgramView extends View {
    
    /**
     *
     */
    public String[] displayStartProgramView(){
        boolean endOfView = false;
        String [] inputs;
        
        System.out.println(
                  "\n***********************************"
                + "\n* Welcome to the Pioneer Trail    *"
                + "\n* In this game you will journey   *"
                + "\n* with your family from Missouri  *"
                + "\n* to Utah. You will encounter     *"
                + "\n* various obstacles along the     *"
                + "\n* way. Try to make it with as     *"
                + "\n* many family members as possible *"
                + "\n***********************************"
                + "\n"
                + "\n Enter any letter but Q to start  *");
        
        do {
            inputs = this.getInputs();
        
        if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
        break;
        }
        else{
                  
        endOfView = doAction(inputs);
        }
        }
       while (endOfView != true);
       return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        //System.out.println("doAction called");
        //System.out.println("\tinputs = " + inputs[0]);
        String[] playerName = new String [1];
        System.out.println("Please enter your name:");
        Scanner userInput = new Scanner(System.in);
        playerName[0]= userInput.nextLine();
           
        Player player = GameControl.savePlayer(playerName[0]);
        Player playerOne = PioneerTrail.getPlayer();
               
        if(playerName[0].equals("")){
            System.out.println("Could not create the player. " + 
                        "Enter a different name.");
            return false;
        }
        else {    
                System.out.println("\n======================================"
                    + "\nWelcome to the game " + playerOne.getName()
                    + "\nWe hope you have a lot of fun!"
                    + "\n======================================");
        }
                
         NewMainMenuView mainMenu = new NewMainMenuView();
         mainMenu.display();
         
       return true;
       }
           
    }

