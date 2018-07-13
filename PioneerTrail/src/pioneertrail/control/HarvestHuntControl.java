/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.control;

import pioneertrail.exceptions.HarvestHuntControlException;
import pioneertrail.model.Resource;

/**
 *
 * @author Jacob Enszer
 */
public class HarvestHuntControl {

    public static int calcHuntForResources(int noElk, int noBullets)
            throws HarvestHuntControlException {
        if (noElk < 1) {
            throw new HarvestHuntControlException("No Elk in Location");
        }
        if (noBullets < 1 || noBullets > 20) {
            throw new HarvestHuntControlException("Incorrect Bullet Quantity");
        }
        if (noBullets >= noElk) {
            int weight = noElk * 50;
            return weight;
        } else {
            int weight = (noElk - (noElk - noBullets)) * 50;
            return weight;
        }
    }
}
