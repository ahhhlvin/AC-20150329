package nyc.c4q.ac21;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by alvin2 on 3/29/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class MoonsAndPlanets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();

        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Earth", 14);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);
        numberOfMoons.put("Neptune", 14);

        numberOfMoons.put("Earth", 1); // '.put' allows you to override

        // System.out.println("Please enter how many moons Earth should have: ");
        // int earthMoon = scanner.nextInt();
        // numberOfMoons.put("Earth", earthMoon);

        System.out.println(numberOfMoons.get("Earth"));   // '.get' allows you to retrieve the VALUE that matches the specified KEY entered within the parentheses

        System.out.println(getNumberOfMoons("Mars"));
        System.out.println(isPlanet("minaj"));

    }

    public static HashMap<String, Integer> getNumberOfMoons() {
        HashMap<String, Integer> numberOfMoons = new HashMap<String, Integer>();

        numberOfMoons.put("Mercury", 0);
        numberOfMoons.put("Venus", 0);
        numberOfMoons.put("Earth", 1);
        numberOfMoons.put("Mars", 2);
        numberOfMoons.put("Jupiter", 67);
        numberOfMoons.put("Saturn", 62);
        numberOfMoons.put("Uranus", 27);
        numberOfMoons.put("Neptune", 14);

        return numberOfMoons;


    }


    public static int getNumberOfMoons(String planet) {
        return getNumberOfMoons().get(planet);
    }


    public static boolean isPlanet(String name) {

        if (getNumberOfMoons().containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

}
