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
public class View implements ViewInterface{

    public View() {
    }
    
   @Override
     public void display(){
        boolean endOfView = false;
        String[] inputs = null;
        
        do {
        
        System.out.println("\n V - View Map"
                    + "\n I - View Inventory"
                    + "\n P - Purchase Supplies"
                    + "\n M - Move to New Location"
                    + "\n R - Repair Wagons"
                    + "\n H - Hunt for Resources"               
                    + "\n S - Save Game"
                    + "\n Z - Help"                 
                    + "\n Q - Exit to Previous Menu");
        String input = this.getInput();
                
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
    
    @Override
   public String getInput(){

        String[] inputs = new String [1];
        System.out.println("GAME MENU");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Enter your choice");
           Scanner userInput = new Scanner(System.in);
           inputs[0] = userInput.nextLine();
                                                       
           if(inputs[0].trim().equals("") == true){
           System.out.println("You must enter a non-blank value");
           continue;
           }           
                      
           valid = true;
        }
        return inputs[0]; 
    }
    
}
