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
    public String[] displayStartProgramView(){
        boolean endOfView = false;
        
        do {
            String[] inputs = this.getInputs();
        
         if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
         break;
         }
         else{
          return inputs;
         }
         
        endOfView = doAction(inputs);
        }
       while (endOfView != true);
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
        

    
        }
    }