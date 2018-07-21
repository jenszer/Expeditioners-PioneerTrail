/*
 */
package pioneertrail.control;

import pioneertrail.exceptions.WagonControlException;
import pioneertrail.model.Inventory;
import pioneertrail.model.Wagon;

/**
 *
 * @author Ariel George
 */
public class WagonControl {

    public static int calcRemainingWeight(Wagon wagon, Inventory inventoryItem)
            throws WagonControlException {

        if (inventoryItem.getAmount() < 1) {
            throw new WagonControlException("You must have at least 1 amount");
        }
        if (inventoryItem.getWeight() < 1) {
            throw new WagonControlException("Weight cannot be 0");
        }
        if (wagon.getCurrentWeight() < 0) {
            throw new WagonControlException("Current weight must be more than 0");
        }
        if (wagon.getCurrentWeight() >= wagon.getMaxWeight()) {
            throw new WagonControlException("Max Weight Exceeded");
        }
        if (wagon.getCurrentWeight() + (inventoryItem.getAmount() * inventoryItem.getWeight()) > wagon.getMaxWeight()) {
            throw new WagonControlException("Max Weight Exceeded");
        }
        wagon.setCurrentWeight(wagon.getCurrentWeight() + inventoryItem.getAmount() * inventoryItem.getWeight());
        return wagon.getCurrentWeight();
    }
}
