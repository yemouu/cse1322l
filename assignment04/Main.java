/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 4
*/

// 2021-09-13
// 2021-09-17

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double catchMultipliers, catchProbability, cpm = 0.49985844;

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    String yn;

    Pokedex myDex = new Pokedex();
    Pokemon spawned;

    do {
      spawned = spawn();

      while (true) {
        catchMultipliers = throwBall();
        catchProbability =
            1.0 - Math.pow((1.0 - (spawned.getBaseCatchRate() / (2.0 * cpm))), catchMultipliers);

        if (random.nextFloat() < catchProbability) {
          System.out.println(spawned + " Caught");
          myDex.addToDex(spawned);
          break;
        } else System.out.println("Oops " + spawned + " Jumped out, try again!");
      }

      System.out.println("Continue Catching Pokemon? (Y or N)");
      yn = input.nextLine();
    } while (yn.equals("Y"));

    System.out.println(myDex);
  }

  public static Pokemon spawn() {
    int lvl, pokemon;

    Random random = new Random();

    // Number between 0 (exclusive) and 20 (inclusive)
    // Having a level 0 pokemon doesn't make sense
    lvl = random.nextInt(20) + 1;

    // Number between 0 (inclusive) and 3 (exclusive)
    pokemon = random.nextInt(3);

    // Spawn Pokemon based on random number
    switch (pokemon) {
      case 1:
        System.out.println("You encounter A lvl " + lvl + " Bulbasaur");
        return new Bulbasaur(lvl);
      case 2:
        System.out.println("You encounter A lvl " + lvl + " Charmander");
        return new Charmander(lvl);
      default:
        System.out.println("You encounter A lvl " + lvl + " Caterpie");
        return new Caterpie(lvl);
    }
  }

  public static float throwBall() {
    float ballMultiplier, berryMultiplier, curveMultiplier;
    ballMultiplier = berryMultiplier = curveMultiplier = 1;

    String ballType, berryType, curveBall;
    Scanner input = new Scanner(System.in);

    System.out.println("What type of ball do you wish to use? (Poke, Great, Ultra)");
    ballType = input.nextLine();

    System.out.println("What berry do you wish to use? (None, Razz, SilverPinap, GoldenRazz)");
    berryType = input.nextLine();

    System.out.println("Is this a curveBall? (Yes or No)");
    curveBall = input.nextLine();

    switch (ballType) {
      case "Great":
        ballMultiplier = 1.5f;
        break;
      case "Ultra":
        ballMultiplier = 2;
        break;
    }

    switch (berryType) {
      case "Razz":
        berryMultiplier = 1.5f;
        break;
      case "SilverPinap":
        berryMultiplier = 1.8f;
        break;
      case "GoldenRazz":
        berryMultiplier = 2.5f;
        break;
    }

    if (curveBall.equals("Yes")) curveMultiplier = 1.7f;

    return ballMultiplier * berryMultiplier * curveMultiplier;
  }
}
