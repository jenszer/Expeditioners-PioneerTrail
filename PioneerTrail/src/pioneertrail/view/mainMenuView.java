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
class mainMenuView {

    public mainMenuView() {
    }
    
   public void display(){
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
        return;
        }
   
    public String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("MAIN MENU");
        
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
            case "N": //for new game
                //this.startNewGame();
                System.out.println("N called");
                break;
            case "R":
                //this.restartGame();
                System.out.println("R called");
                break;
            case "H":
                //this.getHelp();
                System.out.println("H called");
                break;
            case "E":
                System.out.println("E called");
                break;   
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
  //  public static void createNewGame(Player player);
    //    gameMenuView = ;

}