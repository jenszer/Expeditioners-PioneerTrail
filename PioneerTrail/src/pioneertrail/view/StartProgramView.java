/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author arielgeorge
 */
public class StartProgramView {
    
    /**
     *
     */
    public StartProgramView() {
    boolean endOfView = false;
    
    do {
        String[] inputs = this.getInputs();
        
        toUpperCase(inputs);
        
        if(inputs.length < 1) {
        System.out.println("try again");
        continue;
        }
          
        if (endOfView = doAction(inputs)){
        }
        }
    
    while (endOfView != true);
    
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
