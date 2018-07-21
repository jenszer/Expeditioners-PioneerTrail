/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.io.PrintWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Jacob Enszer
 */
public class ErrorView {

    private static PrintWriter console = PioneerTrail.getOutFile();
    private static PrintWriter log = PioneerTrail.getLogFile();

    public static void display(String className, String errorMessage) {

        console.println(
                "\n---ERROR-------------------------"
                + "\n" + errorMessage
                + "\n---------------------------------");

        log.printf("%n%n%s", className + " - " + errorMessage);
    }

    static void display(String error_saving_Invenotry_items_list_to_file) {
        throw new UnsupportedOperationException(); 
    }

    
}
