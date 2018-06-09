package pioneertrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author arielgeorge
 */
public class StartProgramView {
    
    /**
     *
     */
    public boolean displayStartProgramView(){
        boolean endOfView = false;
        
         do {
            String[] inputs = this.getInputs();
        
         if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
         break;
         }
          
        endOfView = doAction(inputs);
        return endOfView;
        }
        while (endOfView != true);
           
    return false;
    }

    private String[] getInputs() {
        String[] inputs = new String [1];
        System.out.println("USER INPUT PROMPT");
        
        boolean valid = false;
        while (valid == false){
           System.out.println("Please enter a value: ");
           Scanner userInput = new Scanner(System.in);
           inputs[0] = userInput.next();
           String input = inputs[0].trim();
                                            
           if(input.length() < 1){
           System.out.println("You must enter a non-blank value");
           continue;
           }           
                  
           inputs[0] = input;
           
           valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("***doAction() called***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;

    
        }
    }
