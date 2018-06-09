package pioneertrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

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
          
        if (endOfView = doAction(inputs)){
            return endOfView;
        }
    }
    while (endOfView != true);
    return false;
    }
    private String[] getInputs() {
              
        System.out.println("Display a description of the view");
        
        String[] inputs = new String [1];
        Scanner userInput = new Scanner(System.in);
        
        boolean valid = false;
        while (!valid){
           System.out.println("Please enter a value: ");
           inputs[0] = userInput.next();
           inputs[0] = inputs[0].trim();
           
           if((inputs.length) < 1){
           System.out.println("You must enter a non-blank value");
           continue;
           }
           
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
