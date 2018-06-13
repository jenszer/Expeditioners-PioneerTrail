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
public class HelpMenuView {
    
   public HelpMenuView() {
        }
    
   public void display(){
        boolean endOfView = false;
        String inputs[];
                           
        do {
        
        System.out.println("\n A - About Game"
                    + "\n C - Game Controls"
                    + "\n O - Object of the game"
                    + "\n I - Items"
                    + "\n Q - Exit to Previous Menu");
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
        System.out.println("The Pioneer Trail game is a text based role playing"
                + " game. In this game, you will be a pioneer family who leads "
                + " a wagon train preparing to go west. You have suffered "
                + "constant religious persecution and wish to find freedom and"
                + " a new life in a better place. You have heard of a place"
                + " called Zion in the mountains that offers such freedom and"
                + " are eager to start your journey.");
            }
    public void gameControls(){
        System.out.println("Problems may arise during the trip, such as illness"
                + " or death of family members, snake bites, broken wagons, "
                + "adverse weather conditions, etc. You will have the "
                + "opportunity to hunt if you have weapons and ammunition when "
                + "you spot a bison, or an elk. If you have the needed supplies"
                + " you could repair your damaged wagon, and fish when arriving"
                + " at a lake or river. You will also have to stop to rest from"
                + " time to time, due to weak animals or to obtain food.");
    }
    public void objectOfGame(){
        System.out.println("The goal of the game is to reach Zion and survive"
                + " with as many family members as you can. The game will be"
                + " over when at least two family members have reached Zion.");
    }
    public void items(){
        System.out.println("Your family is composed of both parents and three "
                + "children. Before starting the long journey of 1,500 miles, "
                + "you must buy a series of items necessary for the trip, such "
                + "as: food, water, tools, spare parts for the wagon, weapons, "
                + "ammunition, etc. You must plan carefully so that you will "
                + "have the items you need before you begin your journey.");
    }

    
}
