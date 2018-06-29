/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

/**
 *
 * @author arielgeorge
 */
public class MoveView extends View {

   
    @Override
    public void display () {
        
        
        
        boolean endOfView = false;
        String[] inputs = null;
        
        do {
        System.out.println("Which Way Would You Like to Move?");
        
        System.out.println("\n V - View Map"
                    + "\n A - Nauvoo"
                    + "\n B - Sugar Creek"
                    + "\n C - Richardson’s Point"
                    + "\n D - Chariton River Crossing"
                    + "\n E - Locust Creek"
                    + "\n F - Garden Grove"
                    + "\n G - Nishnabotna River"
                    + "\n H - Grand Encampment"
                    + "\n Y - Council Bluffs"
                    + "\n J - Winter Quarters"
                    + "\n K - Elkhorn River Crossing"
                    + "\n L - Platte River"
                    + "\n M - Fort Kearny"
                    + "\n N - Confluence Point"
                    + "\n O - Ash Hollow"
                    + "\n P - Chimney Rock"
                    + "\n Q - Scotts Bluff"
                    + "\n R - Fort Laramie"
                    + "\n S - Sweetwater River"
                    + "\n T - Independence Rock"
                    + "\n U - Fort Bridger"
                    + "\n V - Echo Canyon"
                    + "\n W - Golden Pass Road"
                    + "\n X - Emigration Canyon"
                    + "\n Z - Zion");
                        
        if((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
        break;
        }
        else{     
        endOfView = this.doAction(inputs);
        }
        }
        while (endOfView != true);
        }

    public boolean doAction(String[] inputs) {
        String location = inputs[0].toUpperCase().trim();
        switch (location){
            case "A": 
                System.out.println("Nauvoo picked");    
                break;
            case "B": 
                System.out.println("Sugar Creek picked");    
                break;            
            case "C": 
                System.out.println("Richardson’s Point picked");    
                break;
            case "D": 
                System.out.println("Chariton River Crossing picked");    
                break;
            case "E": 
                System.out.println("Locust Creek picked");    
                break;
            case "F": 
                System.out.println("Garden Grove picked");    
                break;            
            case "G": 
                System.out.println("Nishnabotna River picked");    
                break;
            case "H": 
                System.out.println("Grand Encampment picked");    
                break;
            case "Y": 
                System.out.println("Council Bluffs picked");    
                break;
            case "J": 
                System.out.println("Winter Quarters picked");    
                break;            
            case "K": 
                System.out.println("Elkhorn River Crossing picked");    
                break;
            case "L": 
                System.out.println("Platte River picked");    
                break;
            case "M": 
                System.out.println("Fort Kearny picked");    
                break;
            case "N": 
                System.out.println("Confluence Point picked");    
                break;            
            case "O": 
                System.out.println("Ash Hollow picked");    
                break;
            case "P": 
                System.out.println("Chimney Rock picked");    
                break;
            case "Q": 
                System.out.println("Scotts Bluff picked");    
                break;            
            case "R": 
                System.out.println("Fort Laramie picked");    
                break;
            case "S": 
                System.out.println("Sweetwater River picked");    
                break;
            case "T": 
                System.out.println("Independence Rock picked");    
                break;
            case "U": 
                System.out.println("Fort Bridger picked");    
                break;            
            case "V": 
                System.out.println("Echo Canyon picked");    
                break;
            case "W": 
                System.out.println("Golden Pass Road picked");    
                break;              
            case "X": 
                System.out.println("Emigration Canyon picked");    
                break;            
            case "Z": 
                System.out.println("Zion picked");    
                break;        
        }       
        return true;
    }

    @Override
    public boolean doAction(String inputs) {
        return true;
    }
        
}
