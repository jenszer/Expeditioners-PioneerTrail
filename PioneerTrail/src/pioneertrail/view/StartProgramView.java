package pioneertrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import pioneertrail.control.GameControl;


/**
 *
 * @author arielgeorge
 */
public class StartProgramView {
    
    /**
     *
     */
    public String[] displayStartProgramView(){
        boolean endOfView = false;
        String [] inputs;
        
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

    public String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("USER INPUT PROMPT");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Please enter a value: ");
           Scanner userInput = new Scanner(System.in);
           inputs[0] = userInput.nextLine();
                                                       
           if(inputs[0].trim().equals("") == true){
           System.out.println("You must enter a non-blank value");
           continue;
           }           
                      
           valid = true;
        }
        return inputs;
    }

    public boolean doAction(String[] inputs) {
        //System.out.println("doAction called");
        //System.out.println("\tinputs = " + inputs[0]);
        String[] playersName = new String [1];
        System.out.println("Please enter your name:");
        Scanner userInput = new Scanner(System.in);
        playersName[0]= userInput.nextLine();
        
        Player instance player = GameControl.savePlayer(playersName[0]);
        
        if(player ==null){
            System.out.println("Could not create the player. " + 
                        "Enter a different name.");
            return false;
            }
            System.out.println("======================================"
                    + "Welcome to the game " + player
                    + "We hope you have a lot of fun!"
                    + "==========================================");
        
        String value = inputs[0].toUpperCase();
        
        switch (value){
            case "N": //for new game
                //this.newGame();
                System.out.println("Start a new Game");
                break;
            case "L":
                //this.loadGame();
                System.out.println("Load Game");
                break;
            case "H":
                //this.helpMenu();
                System.out.println("Help Menu");
                break;
            case "S":
                //this.saveGame();
                System.out.println("Save Game");
                break;
            default:
                System.out.println("\n***Try again***");
                break;
                
        }
        
        //return true;
        }
    }
