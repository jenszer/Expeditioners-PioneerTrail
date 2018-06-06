package pioneertrail.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
            String input = toUpperCase(inputs);
            boolean equal = input.equals("Q");
        
         if((inputs.length < 1) || (equal == true)) {
         System.out.println("Invalid Entry; Try Again");
         continue;
            }
          
        if (endOfView = doAction(inputs)){
            return endOfView;
        }
    }
    while (endOfView != true);
    return false;
    }
    private String[] getInputs() {
        System.out.println("***getInputs() called***");
        
        String[] inputs = new String [1];
        inputs[0] = "testInput";
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("***doAction() called***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;

    
        }
    }
