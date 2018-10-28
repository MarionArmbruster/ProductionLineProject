/***************************************************
 * File: Main.java
 * Author: Marion Armbruster
 * Date: 29 September 2018 - 27 October 2018
 *
 * A testing driver class for this on-going project
 * is needed as the exercise specifications have not
 * yet declared that a normal driver class be made.
 * This driver class is also necessary due to the
 * abstract class, since that class by itself cannot
 * instantiate objects, and thus cannot test the
 * program.
 ****************************************************/

package productionline;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  /**
   * The main method of the Main class which handles all of the action and to which control of the
   * program always returns
   *
   * @param args The normal parameter for any main method, a String array named args.
   */
  public static void main(String[] args) {

    // first testing
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    //a loop instead of the above as a shorter way to write a test
    for (int i = 3; i < 14; i++) {
      Widget object = new Widget("Widget " + i);
      System.out.println(object.toString());
    } // end of for loop

    // test for Step 5 and step 6
    AudioPlayer myPlayer = new AudioPlayer("i-pod", "mp3");
    System.out.println(myPlayer.toString());

    // test for step 8 and 9 
    Screen aScreen = new Screen("720 x 480", 23, 45);
    System.out.println(aScreen.toString() + "\n");

    // test for audio player methods
    myPlayer.play();
    myPlayer.next();
    myPlayer.previous();
    myPlayer.stop();

    // test for Screen class; step 10 - see test for 8/9

    // test for Movie Player; step 12
    MoviePlayer aMoviePlayer = new MoviePlayer("DVD player", new Screen("720 x 480", 23, 45),
        MonitorType.LCD);
    System.out.println(aMoviePlayer);

    // test for visual/video player methods
    aMoviePlayer.play();
    aMoviePlayer.next();
    aMoviePlayer.previous();
    aMoviePlayer.stop();

    // also a step 12 test
    PlayerDriver.testPlayer();

    // test for step 13
    MultimediaControl media1 = new AudioPlayer("CD player", "ROM");
    MultimediaControl media2 = new MoviePlayer("Computer Disk Drive",
        new Screen("1080 x640", 48, 32), MonitorType.LED);

    System.out.println(media1);
    System.out.println(media2);

    // test for steps for 14, 15 and 16
    ArrayList<Product> products = new ArrayList<>();

    products = collectionTest(products);

    Collections.sort(products);

    print(products);


  }// end of Main method

  /**
   * A method that is passed an empty ArrayList, in which objects are made for, then added to the
   * ArrayList.
   *
   * @param products The initially empty ArrayList.
   * @return The filled in ArrayList that now has items of Product in it.
   */

  public static ArrayList<Product> collectionTest(ArrayList products) {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480", 40, 22),
        MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768", 40, 22),
        MonitorType.LED);

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);

    return products;

  } // end of collectionTest method

  /**
   * A generic print method that iterates through an ArrayList of any object type and prints all the
   * items contained in that collection.
   *
   * @param list The list that contains the items (example is an ArrayList with object in it).
   * @param <T> The generic object type, allowing for any type to be passed into the method.
   */

  public static <T> void print(List<T> list) {
    for (T item : list) {
      System.out.println(item);
    }
  } // end of print method


} // end of Main driver class


/**
 * @author Professor Scott VanSelow
 *
 * The Google checks checkstyle plugin says this class must be in its own file, however this is how
 * Professor Vanselow had his Main file of this project. Allows the use of Widget as seen at the
 * beginning of main.
 */

class Widget extends Product {

  /**
   * A method that passes in a name and calls the parents constructor to use it.
   *
   * @param name The name of the product that is passed in.
   */
  public Widget(String name) {
    super(name);
  }

} // end of class Widget