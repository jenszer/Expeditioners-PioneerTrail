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
class MainMenuView {

    public MainMenuView() {
    }
    
   public void display(){
        boolean endOfView = false;
        String inputs[];
                           
        do {
        inputs = this.getInputs();
        System.out.println("\n N - Create New Game"
                    + "\n R - Restart Game"
                    + "\n H - Get Help"
                    + "\n E - Test Program"
                    + "\n Q - Quit");
        
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
                this.startNewGame();
                break;
            case "R":
                this.restartGame();
                break;
            case "H":
                this.getHelp();
                break;
            case "E":
                this.test();
                break;   
            default:
            System.out.println("\nInvalid Menu Item.");
                break;
        }
       return false;
    }
    
    public void startNewGame(){
        System.out.println("New Game Stub");
            }
    public void restartGame(){
        System.out.println("Restart Game Stub");
    }
    public void getHelp(){
        System.out.println("Help Stub");
    }
    public void test(){
        System.out.println("Test Stub");
    }
}