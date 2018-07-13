/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail.view;

import java.util.ArrayList;
import pioneertrail.exceptions.WagonControlException;
import pioneertrail.control.WagonControl;
import pioneertrail.model.Game;
import pioneertrail.model.Inventory;
import pioneertrail.model.Resource;

/**
 *
 * @author Hector Mendoza
 */
public class PurchaseSuppliesView extends View {

    public PurchaseSuppliesView() {
        super(      "================"
                + "\n Purchase Items"
                + "\n================"
                + "\n F - Food"
                + "\n H - Hammer"
                + "\n S - Spare Wheels"
                + "\n B - Bullets"
                + "\n D - Drinking Water"
                + "\n Q - Quit");
            }

    Game game = new Game();

    ArrayList<Inventory> inventory = game.getItems();


    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        menuItem = inputs.toUpperCase();

        switch (menuItem) {
            case "F":
            { 
              try {
                  this.purchaseFood();
                } catch (WagonControlException ie) {
                   System.out.println(ie.getMessage());
                   return true;
            }
        }
         break;
         
        case "H":
          {
            try {
                this.purchaseHammer();
            } catch (WagonControlException ie) {
               System.out.println(ie.getMessage());
               return true;
            }
        }
                break;
         
        case "S":
          {
            try {
                this.purchaseSpareWheels();
            } catch (WagonControlException ie) {
               System.out.println(ie.getMessage());
               return true;
            }
       }
              break;
         
        case "B":
        {
            try {
                this.purchaseBullets();
            } catch (WagonControlException ie) {
               System.out.println(ie.getMessage());
               return true;
            }
        }
                break;
         
          case "D":
            {
            try {
                this.purchaseDrinkingWater();
            } catch (WagonControlException ie) {
               System.out.println(ie.getMessage());
               return true;
            }
        }
               break;        
         
  
            default:
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid Menu Item.");
                break;
   
    }
        return false;
    }        
    public int purchaseFood() 
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Food");
        return 0;
    }

    public int purchaseAxe() 
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Axe");
    return 0;
    }
    public int purchaseHammer()
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Hammer");
        return 0;
    }

    public int purchaseSpareWheels()
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Wheel");
        return 0;
    }

    public int purchaseBullets()
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Bullet");
        return 0;
    }

    public int purchaseWood()
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Wood");
        return 0;
    }

    public int purchaseDrinkingWater() 
        throws WagonControlException{
        Resource resource = new Resource();
        resource.setAmount(1);
        System.out.println("You've purchased " 
                + resource.getAmount() + "Water");
        return 0;
    }

    public void viewInventory() {
        System.out.println(inventory.toString());
    }

}
