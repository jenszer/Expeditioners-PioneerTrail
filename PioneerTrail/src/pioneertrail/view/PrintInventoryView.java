/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arielgeorge
 */

public class PrintInventoryView {
    
    public void PrintInventoryView() {
    
        FileWriter outFile = null;
    
    String fileLocation  = "inventoryItems.txt";
    
 
    try{
    
        outFile = new FileWriter(fileLocation);
            
        outFile.write("Water\n");
        outFile.write("Food\n");
        outFile.write("Bullets\n");
        outFile.write("Hammer\n");
        outFile.write("Wheels\n");
        outFile.write("Rest\n");
            
        outFile.flush();
            
        } catch (IOException ex){
            System.out.println("List of inventory items");
        }
    }
    
    
    
            

        



}