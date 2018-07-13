/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.exceptions;

/**
 *
 * @author Jacob Enszer
 */
public class HarvestHuntControlException extends Exception {

    public HarvestHuntControlException() {
    }

    public HarvestHuntControlException(String string) {
        super(string);
    }

    public HarvestHuntControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public HarvestHuntControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public HarvestHuntControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
