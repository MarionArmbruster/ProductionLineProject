/***************************************************
 * File: MoviePlayer.java
 * Author: Marion Armbruster
 * Date: 19 October 2018
 ****************************************************/

package productionline;

/**
 * The MoviePlayer normal class implements the interface Multimedia Control and is a child class of
 * Product. It defines and uses the methods of Multimedia Control and is a different type of product
 * from AudioPlayer, as well as a more specific type of product.
 *
 * @Author Marion Armbruster
 * @Author Professor Scott VanSelow for various assistance
 */
public class MoviePlayer extends Product implements MultimediaControl {

  // instance variables
  private Screen screen;
  private MonitorType monitorTyping;

  /**
   * A overloaded constructor that takes in a product name, screen information, and a screen monitor
   * type, assigns them to either the field variable or calls the parent class's constructor to use
   * the information there.
   *
   * @param productName the name of the product created at the time of calling the constructor
   * @param screen A Screen type argument to pass information on to the Screen class
   * @param monitorTyping A MonitorType type argument to pass information on to the MonitorType enum
   *                      class
   */
  public MoviePlayer(String productName, Screen screen, MonitorType monitorTyping) {
    super(productName);
    this.screen = screen;
    this.monitorTyping = monitorTyping;
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what "play"
   * does specifically for the visual type.
   */
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what "stop"
   * does specifically for the visual type.
   */
  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what
   * "previous" does specifically for the visual type.
   */
  @Override
  public void previous() {
    System.out.println("GoTo Previous movie");
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what "next"
   * does specifically for the visual type.
   */
  @Override
  public void next() {
    System.out.println("GoTo Next movie");
  }

  /**
   * A toString method that displays the information included.
   *
   * @return String that displays all the information from other classes through the super keyword,
   *         in addition to the local monitor type instance variable and a call to the toString
   *         method in class Screen (which displays the information specific to that class as well).
   */
  @Override
  public String toString() {
    return super.toString() + "Monitor is    : " + monitorTyping + screen.toString();
  }

} // end of MoviePlayer class
