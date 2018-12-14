/***************************************************
 * File: Screen.java
 * Author: Marion Armbruster
 * Date: 6 October 2018
 ****************************************************/

package productionline;

/**
 * The normal class Screen implements the Interface ScreenSpec, and as such uses all of its methods
 * to give specifications of a particular screen. This class returns the information it is given via
 * a toString method that follows the same format as Product.
 *
 * @Author Marion Armbruster
 * @Author Professor Scott VanSelow for various assistance
 */
public class Screen implements ScreenSpec {

  // instance variables
  private String resolution;
  private int refreshrate;
  private int responsetime;

  /**
   * The overloaded constructor that takes in a String parameter for the resolution by pixel of the
   * screen, an integer parameter for the specific refresh rate of the screen, and an integer
   * parameter for the response time. Each parameter is assigned to their respective instance
   * variable of the class.
   *
   * @param resolution format of a screen should be "number x number", i.e. 720 x 480
   * @param refreshrate is the rate at which the screen refreshes in ms
   * @param responsetime is the amount of time it takes for the screen display to mirror actions
   *                     done
   */
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  /**
   * A getter method that returns the String from the instance variable resolution.
   *
   * @return The resolution quality of the screen.
   */
  @Override
  public String getResolution() {
    return resolution;
  }

  /**
   * A getter method that returns the integer from the refresh rate instance variable.
   *
   * @return The refresh rate of the screen, usually in ms.
   */
  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  /**
   * A getter method that returns the integer from the response time instance variable.
   *
   * @return The refresh time that the screen has.
   */
  @Override
  public int getResponseTime() {
    return responsetime;
  }

  /**
   * A toString method that displays the given information in the same format as the Product and
   * AudioPlayer classes.
   *
   * @return The String to display the resolution, refresh rate, and response time information.
   */
  @Override
  public String toString() {
    return String.format("%nResolution    : %s%nRefresh Rate  : %s%nResponse Time : %s",
        resolution, refreshrate, responsetime);
  }

}
