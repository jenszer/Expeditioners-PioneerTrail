/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arielgeorge
 */
public class PrintInventoryView {
    FileWriter outFile = null;
    
    String fileLocation = "inventoryItems.txt"
            
    try (FileWriter out = new FileWriter(filePath)) {
    
    outfile.write("Water\n");
    outfile.write("Food\n");
    outfile.write("Bullets\n");
    outfile.write("Hammer\n");
    outfile.write("Wheels\n");
    outfile.write("Rest\n");
    
    outFile.flush();
           
}  catch (IOException ex) {
    ErrorView.display("Error saving Invenotry items list to file");
}   finally {
    if (outFile != null) {
        try {
            outFile.close();
        } catch (IOException ex2) {
            ErrorView.display("Error closing file");
        }
    }
  }
}


try (PrintWriter out = new PrintWriter(filePath)) {

   out.println("Your report text goes here");

// you should have several lines and a for each statement to print the list of items

}

} catch (IOException ex) {
ErrorView.display(this.getClass().getName(), "I/0 Error: " + ex.getMessage());
}
