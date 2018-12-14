/***************************************************
 * File: Main.java
 * Author: Marion Armbruster
 * Date: 29 September 2018 - 13 December 2018
 ****************************************************/

package productionline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The Main class will allow a user to add user-defined products and to specify how many items of a
 * product should be created. These products are created and stored in a collection. The collection
 * can be displayed at any time and new products can be added at any time from the main menu.
 * Production statistics can also be displayed as the total number of items produced, the number of
 * each item, and the number of unique products created. The user decides when to quit the program.
 */

public class Main {

  /**
   * The main method of the Main class which handles all of the "actions" of the program and to
   * which control of the program always returns. It had contained many statements to test all the
   * other classes of the production line program and now serves as a command-line interface.
   *
   * @param args The normal parameter for any main method, a String array named args.
   * @Author Marion Armbruster
   */
  public static void main(String[] args) {
    /*FindBugs says "Found reliance on default encoding: new java.util.Scanner(InputStream)" for
    the normal regular use of the Scanner class for getting input from the console.*/
    Scanner input = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();

    System.out.print("Welcome to the Oracle Production's Line! This program will allow you to"
        + " perform the any of the following operations:\n");

    // needs to be outside the scope of do-while loop in order for the while to "see" the variable
    int choice;

    // loops through the full program
    do {
      // displays menu again after user is finished with one branch of the program
      do {

        // the option menu
        System.out.println("\nEnter a menu number for selection: \n1. Add a New Product \n2. "
            + "Display all Products \n3. Statistics of Products \n4. Quit Program");

        // calls number validating method to check input from user
        choice = checkForValidInput(input);
      } while (choice < 1 || choice > 4);

      switch (choice) {
        case 1:
          // call to add Products with passed-in ArrayList
          addProducts(input, products);

          // call to write all information in ArrayList to file
          System.out.println("\n\nWriting data to the file. . . The program needs your employee"
              + " name and department number.");
          TestProductionLine.testProductionMethod(input, products);
          System.out.println("Successfully wrote to file. File is located at C:\\LineTests\\.");
          break;
        case 2:
          System.out.print("\nAll items in the Collection: \n");
          input.nextLine();

          // call to generic collection and displays all objects
          CollectionsTest.print(products);
          System.out.println("\nPress the enter key when you are ready to continue.");
          String pause = input.nextLine();
          break;
        case 3:
          // displays all of the stats of the ArrayList
          productStatistics(input, products);
          break;
        case 4:
          // closes the scanner object
          input.close();
          // prints prompt to console to reaffirm the user ended the program
          System.out.println("Program terminated. . .");
          break;
        default:
          System.out.println("CheckStyle wanted a default clause even though it will not be used.");
      }

    } while (choice != 4);

  } // end of Main method

  /**
   * This method checks all input taken by the user. It ensures that nothing breaks or crashes the
   * program for any time that it is called.
   *
   * @param input The System.in Scanner object passed into the method in order to be used, as
   *              opposed to creating a new object in this method.
   * @return The validated number from user input; used for all the menu options.
   * @Author Professor Vanselow for assistance.
   */
  private static int checkForValidInput(Scanner input) {
    int number = 0;
    boolean gotGoodInput = true;
    while (gotGoodInput) {
      try {
        number = input.nextInt();
        if (number == 1 || number == 2 || number == 3 || number == 4) {
          gotGoodInput = false;
        } else {
          throw new Exception();
        }
      } catch (InputMismatchException i) {
        System.out.println("\nInput Mismatch Exception: Input was not an integer. Please try"
            + " again.");
        input.nextLine();

      } catch (NoSuchElementException e) {
        System.out.println("No element was found in the stream. Please try again.");

      } catch (IllegalStateException s) {
        System.out.println("Exception found; " + s + "\nScanner reopened.");
         /*FindBugs says "Found reliance on default encoding: new java.util.Scanner(InputStream)"
         for the normal regular use of the Scanner class for getting input from the console.*/
        input = new Scanner(System.in);

      } catch (Exception ex) {
        System.out.println("General exception: " + ex);
        System.out.println("Input was not a valid integer. Please enter your selection.");
        input.nextLine();
      }
    }
    return number;

  } // end of check for valid input method

  /**
   * This method checks all input taken by the user in a specific if-else statement. It ensures that
   * nothing breaks or crashes the program.
   *
   * @param input The System.in Scanner object passed into the method in order to be used, as
   *              opposed to creating a new object in this method.
   * @return The validated number from user input.
   */
  private static int checkIfInput(Scanner input) {
    int number = 0;
    boolean gotGoodInput = true;
    while (gotGoodInput) {
      try {
        number = input.nextInt();
        if (number == 1 || number == 2) {
          gotGoodInput = false;
        } else {
          throw new Exception();
        }
      } catch (InputMismatchException i) {
        System.out.println("\nInput Mismatch Exception: Input was not an integer. Please try"
            + " again.");
        input.nextLine();

      } catch (NoSuchElementException e) {
        System.out.println("No element was found in the stream. Please try again.");

      } catch (IllegalStateException s) {
        System.out.println("Exception found; " + s + "\nScanner reopened.");
        /*FindBugs says "Found reliance on default encoding: new java.util.Scanner(InputStream)"
         for the normal regular use of the Scanner class for getting input from the console.*/
        input = new Scanner(System.in);

      } catch (Exception ex) {
        System.out.println("General exception: " + ex);
        System.out.println("Input was not a valid integer. Please enter your selection.");
        input.nextLine();
      }
    }
    return number;

  } // end of check for valid input method

  /**
   * This method splits adding the products into their separate branches, depending on what type of
   * product it is. This structure can easily be used for more than just the current types of
   * product to be created.
   *
   * @param input The System.in Scanner object passed into the method in order to be used, as
   *              opposed to creating a new object in this method.
   * @param products The ArrayList of type Product that is passed so that products can be added.
   */
  private static void addProducts(Scanner input, ArrayList<Product> products) {
    int productChoice;
    do {
      System.out.print("\nChoose the type of product to add: 1 for AudioPlayer or 2 for"
          + " MoviePlayer. If you wish to exit this menu, enter 4. ");
      productChoice = checkForValidInput(input);

      input.nextLine(); // clears the stream pipeline

      if (productChoice == 1) {
        audioPlayerLoop(input, products);
      } else if (productChoice == 2) {
        moviePlayerLoop(input, products);
      } else {
        System.out.println("Returning to main menu. . .");
      }
    } while (productChoice == 1 || productChoice == 2);

  } // end of addProducts method

  /**
   * This method will add as many AudioPlayer-type objects to the ArrayList as the user decides to
   * do using a for loop.
   *
   * @param input The System.in Scanner object passed into the method in order to be used, as
   *              opposed to creating a new object in this method.
   * @param products The ArrayList of type Product that is passed so that AudioPlayers can be
   *                 added.
   */
  private static void audioPlayerLoop(Scanner input, ArrayList<Product> products) {
    // ask how many times to add
    System.out.print("How many AudioPlayers would you like to add? Enter a number, please: ");
    int numOfLoops;
    try {
      numOfLoops = input.nextInt();

      input.nextLine(); // clears stream pipeline for switching between int and full line of input

      for (int i = 1; i <= numOfLoops; i++) {
        System.out.print("\nEnter the name of an audio player such as \"iPod Mini\" or \"Walkman\""
            + ": ");
        String auName = input.nextLine();

        System.out
            .print("Enter the type of an audio format such as \"MP3\" or \"WAV\": ");
        String auType = input.nextLine().toUpperCase();

        AudioPlayer au = new AudioPlayer(auName, auType);
        products.add(au);
      }
    } catch (InputMismatchException i) {
      System.out.println("Input mismatch" + i);
      input.nextLine();
    }

  } // end of audio player loop

  /**
   * This method will add as many MoviePlayer-type objects to the ArrayList as the user decides to
   * do using a for loop.
   *
   * @param input The System.in Scanner object passed into the method in order to be used, as
   *              opposed to creating a new object in this method.
   * @param products The ArrayList of type Product that is passed so that MoviePlayers can be
   *                 added.
   */
  private static void moviePlayerLoop(Scanner input, ArrayList<Product> products) {
    // ask how many times to add
    System.out.print("How many MoviePlayers would you like to add? Enter a number, please: ");
    int numOfLoops;
    try {
      numOfLoops = input.nextInt();

      input.nextLine(); // clears stream pipeline for switching between int and full line of input

      for (int i = 1; i <= numOfLoops; i++) {
        System.out.print("\nEnter the name of a movie player: ");
        String mpName = input.nextLine();

        System.out.print("Enter the resolution of the screen as two numbers separated by an \"x\""
            + " with no spaces in between (example: 1366x768): ");
        String mpRes = input.nextLine();

        System.out.print("Enter the refresh rate of the screen (a singular number only): ");
        int refRate = input.nextInt();

        System.out.print("Enter the response time of the screen (a singular number only): ");
        int resTime = input.nextInt();

        // user chooses between the two types of screen then the constructor is called, being
        // passed the user's choices, and added to the Collection
        System.out.print("Choose either 1 for an LCD screen or 2 for LED screen: ");
        int screenType = checkIfInput(input);
        if (screenType == 1) {
          MoviePlayer mp = new MoviePlayer(mpName, new Screen(mpRes, refRate, resTime),
              MonitorType.LCD);
          products.add(mp);
        } else if (screenType == 2) {
          MoviePlayer mp = new MoviePlayer(mpName, new Screen(mpRes, refRate, resTime),
              MonitorType.LED);
          products.add(mp);
        }
        input.nextLine(); // clears stream pipeline for switching between int and full line of input
      }
    } catch (InputMismatchException i) {
      System.out.println("Input mismatch" + i + "Try again.");
      input.nextLine();
    }

  } // end of movie player loop

  /**
   * This method will display the production statistics, by user's choice, of the total number of
   * items produced, the number of each type of item, and the number of unique products created. The
   * user can loop through this menu as many times as the user decides to do.
   *
   * @param input The System.in Scanner object passed into the method in order to be used, as
   *              opposed to creating a new object in this method.
   * @param products The ArrayList of type Product that is passed so that the List can be iterated
   *                 through using List methods to obtain various information about the collection.
   * @Author Professor Vanselow for much assistance.
   */
  private static void productStatistics(Scanner input, ArrayList<Product> products) {
    int stat;
    do {
      do {
        System.out.println("\nEnter 1 to see how many products have been created. Enter 2 to see"
            + " how many of\neach product has been created. Enter 3 for how many unique products"
            + " have been\ncreated. Enter 4 to return to the main menu. ");
        stat = checkForValidInput(input);
      } while (stat < 1 || stat > 4);

      if (stat == 1) {
        System.out.println("Total number of products that have been produced: " + products.size());
      } else if (stat == 2) {
        int movieCount = 0;
        int audioCount = 0;
        for (Product producedItem : products) {
          if (producedItem instanceof MoviePlayer) {
            movieCount++;
          } else if (producedItem instanceof AudioPlayer) {
            audioCount++;
          }
        }
        System.out.println("\nNumber of Movie Players created is: " + movieCount + "\nNumber of"
            + " Audio Players created is: " + audioCount);
      } else if (stat == 3) {
        /*Checks if the Collection is empty, and if not empty, sorts the List into the natural
         order and creates a HashMap. Iterates through the ArrayList to place the necessary
         information into the HashMap and then finds the number of unique items in the ArrayList of
         products using the name specifier.*/

        if (products.isEmpty()) {
          System.out.println("\nThe Array List Collection set is empty. Please add a Product.");
        } else {
          Collections.sort(products);
          HashMap<String, Integer> productName = new HashMap<>();
          Integer count = null;

          for (Product item : products) {
            String name = item.getName();
            count = productName.get(name);
            if (productName.containsKey(name)) {
              productName.put(name, count + 1);
            } else {
              productName.put(name, 1);
            }
          }

          /*FindBugs says that this code "makes inefficient use of keySet iterator instead of
          entrySet iterator". I do not fully understand entrySet, and the program works fine. At a
          later date, I will probably change this to be more efficient.*/
          for (String key : productName.keySet()) {
            Integer value = productName.get(key);
            if (value == 1) {
              System.out.println("There are " + value + " number of unique products that were"
                  + " created. Key: " + key + ".");
            }
          }
        }
      } else {
        System.out.println("Returning to main menu. . .");
      }
    } while (stat != 4);
  } // end of productStatistics method

} // end of Main driver class

/**
 * All that follows from this point are old tests while the program was being built. Saved for the
 * sake of being data and to show the progress of the program.
 */

/*
/**
 * @author Professor Scott Vanselow
 *
 * The Google checks checkstyle plugin says this class must be in its own file, however this is how
 * Professor Vanselow had his Main file of this project. Allows the use of Widget as seen at the
 * beginning of main.
 *
 * A class used to test a widget with the functionality in the main class.
 */
//class Widget extends Product {

/*
/**
 * A method that passes in a name and calls the parents constructor to use it.
 *
 * @param name The name of the product that is passed in.
 */
//public Widget(String name) {
//super(name);
//}

//} // end of class Widget

/*The main driver class for this project which
 * contained statements to test the abstract class,
 * its subclasses, its interfaces, and the other
 * driver classes. It now represents the main control
 * for a command-line program used by employees
 * working in an assembly line for various products.*/

// first testing
    /*Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());*/

// a loop instead of the above as a shorter way to write a test
    /*for (int i = 3; i < 14; i++) {
      Widget object = new Widget("Widget " + i);
      System.out.println(object.toString());
    } // end of for loop
    */

// test for Step 5 and step 6
    /*AudioPlayer myPlayer = new AudioPlayer("i-pod", "mp3");
    System.out.println(myPlayer.toString());*/

// test for step 8 and 9
    /*Screen aScreen = new Screen("720 x 480", 23, 45);
    System.out.println(aScreen.toString() + "\n");

    // test for audio player methods
    myPlayer.play();
    myPlayer.next();
    myPlayer.previous();
    myPlayer.stop();
    System.out.println("\n");*/

// test for Screen class; step 10 - see test for 8/9

// test for Movie Player; step 12
    /*MoviePlayer aMoviePlayer = new MoviePlayer("DVD player", new Screen("720 x 480", 23, 45),
        MonitorType.LCD);
    System.out.println(aMoviePlayer);*/

// test for visual/video player methods
    /*aMoviePlayer.play();
    aMoviePlayer.next();
    aMoviePlayer.previous();
    aMoviePlayer.stop();
    System.out.println("\n");

    // also a step 12 test
    PlayerDriver.testPlayer();*/

// test for step 13
    /*MultimediaControl media1 = new AudioPlayer("CD player", "ROM");
    MultimediaControl media2 = new MoviePlayer("Computer Disk Drive",
        new Screen("1080 x640", 48, 32), MonitorType.LED);

    System.out.println(media1);
    System.out.println(media2);*/

// test for steps for 14, 15 and 16
    /*ArrayList<Product> products = new ArrayList<>();
    products = CollectionsTest.collectionTest(products);
    Collections.sort(products);
    CollectionsTest.print(products);*/

// test for step 17 - optional
//PrintTest.printMethod();

// test for step 18 does not work in this fashion
//TestProductionLine methodForCall = new TestProductionLine();
//System.out.println(myPlayer + "\n" + aMoviePlayer + methodForCall.stepEighteen);

// test for step 19,  20, and step 21
    /*TestProductionLine test20And21 = new TestProductionLine();
    test20And21.testProductionMethod(products);*/