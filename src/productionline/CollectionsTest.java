/***************************************************
 * File: CollectionsTest.java
 * Author: Marion Armbruster
 * Date: 27 October 2018
 *       Revised: 10 December 2018
 ****************************************************/

package productionline;

import java.util.ArrayList;
import java.util.List;

/**
 * A driver test class that contains a method for creating an ArrayList full of ready-made objects
 * of either class AudioPlayer or MoviePlayer and a generic print method that takes any List and
 * prints all objects in that list.
 */
public class CollectionsTest {

  /**
   * A method of the ArrayList data type that is passed an empty ArrayList of Products, and in
   * which objects are made for the ArrayList and added to it. It was used as testing during the
   * gradual creation of the program.
   *
   * @param products The initially empty ArrayList.
   * @return The filled in ArrayList that now has items of Product in it.
   *
   * @author Professor Scott Vanselow, from repl.it
   */
  public static ArrayList<Product> collectionTest(ArrayList<Product> products) {

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
   * A generic print method that iterates through an ArrayList of any object type and prints to the
   * console all the items contained in that collection.
   *
   * @param list The list that contains the items (example is an ArrayList with object in it).
   * @param <T> The generic object type, allowing for any type to be passed into the method.
   */
  public static <T> void print(List<T> list) {
    if (list.isEmpty()) {
      System.out.println("The Array List Collection set is empty. Please add a Product.");
    } else {
      for (T item : list) {
        System.out.println(item);
      }
    }
  } // end of print method

}
