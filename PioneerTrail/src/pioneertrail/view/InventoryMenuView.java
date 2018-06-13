/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Jacob Enszer
 */
public class InventoryMenuView {

    public InventoryMenuView() {
    }
    
    public void display(){
        boolean endOfView = false;
        String inputs[];
                           
        do {
        
        System.out.println("\n A - About Game"
                    + "\n C - Game Controls"
                    + "\n O - Object of the game"
                    + "\n I - Items"
                    + "\n Q - Exit to Main Menu");
        inputs = this.getInputs();
        
        if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
        break;
        }
        else{     
        endOfView = doAction(inputs);
        }
        }
        while (endOfView != true);
        return;
        }
   
    public String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("HELP MENU");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Make your selection: ");
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
        String menuItem = inputs[0];
        menuItem = inputs[0].toUpperCase();
        
       switch (menuItem){
            case "A": 
                this.aboutGame();
                break;
            case "C":
                this.gameControls();
                break;
            case "O":
                this.objectOfGame();
                break;
            case "I":
                this.items();
                break;  
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
    public void aboutGame(){
        System.out.println("About Stub");
            }
    public void gameControls(){
        System.out.println("Game Control Stub");
    }
    public void objectOfGame(){
        System.out.println("Object of Game Stub");
    }
    public void items(){
        System.out.println("Items Stub");
    }

    
}
