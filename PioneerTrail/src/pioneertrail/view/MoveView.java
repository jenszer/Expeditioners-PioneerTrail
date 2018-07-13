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
    public void display() {

        boolean endOfView = false;
        String[] inputs = null;

        do {
            this.console.println("Which Way Would You Like to Move?");

            this.console.println("\n V - View Map"
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

            if ((inputs.length < 1) || inputs[0].equalsIgnoreCase("Q")) {
                break;
            } else {
                endOfView = this.doAction(inputs);
            }
        } while (endOfView != true);
    }

    public boolean doAction(String[] inputs) {
        String location = inputs[0].toUpperCase().trim();
        switch (location) {
            case "A":
                this.console.println("Nauvoo picked");
                break;
            case "B":
                this.console.println("Sugar Creek picked");
                break;
            case "C":
                this.console.println("Richardson’s Point picked");
                break;
            case "D":
                this.console.println("Chariton River Crossing picked");
                break;
            case "E":
                this.console.println("Locust Creek picked");
                break;
            case "F":
                this.console.println("Garden Grove picked");
                break;
            case "G":
                this.console.println("Nishnabotna River picked");
                break;
            case "H":
                this.console.println("Grand Encampment picked");
                break;
            case "Y":
                this.console.println("Council Bluffs picked");
                break;
            case "J":
                this.console.println("Winter Quarters picked");
                break;
            case "K":
                this.console.println("Elkhorn River Crossing picked");
                break;
            case "L":
                this.console.println("Platte River picked");
                break;
            case "M":
                this.console.println("Fort Kearny picked");
                break;
            case "N":
                this.console.println("Confluence Point picked");
                break;
            case "O":
                this.console.println("Ash Hollow picked");
                break;
            case "P":
                this.console.println("Chimney Rock picked");
                break;
            case "Q":
                this.console.println("Scotts Bluff picked");
                break;
            case "R":
                this.console.println("Fort Laramie picked");
                break;
            case "S":
                this.console.println("Sweetwater River picked");
                break;
            case "T":
                this.console.println("Independence Rock picked");
                break;
            case "U":
                this.console.println("Fort Bridger picked");
                break;
            case "V":
                this.console.println("Echo Canyon picked");
                break;
            case "W":
                this.console.println("Golden Pass Road picked");
                break;
            case "X":
                this.console.println("Emigration Canyon picked");
                break;
            case "Z":
                this.console.println("Zion picked");
                break;
        }
        return true;
    }

    @Override
    public boolean doAction(String inputs) {
        return true;
    }

}
