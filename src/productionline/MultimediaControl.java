/***************************************************
 * File: MultimediaControl.java
 * Author: Marion Armbruster
 * Date: 5 October 2018
 *
 * Multimedia Control interface-type class is a group
 * of related methods with empty bodies that defines
 * the behavior of any type of multimedia item.
 ****************************************************/

package productionline;

public interface MultimediaControl {

  // Methods that define the controls of the media

  /**
   * A method that has the functionality of the "play" action of any audio or video player.
   */
  public void play();

  /**
   * A method that has the functionality of the "stop" action of any audio or video player.
   */

  public void stop();

  /**
   * A method that has the functionality of going to the previous item of any audio or video
   * player.
   */

  public void previous();

  /**
   * A method that has the functionality of going to the next item of any audio or video player.
   */
  public void next();

}// end of class MultimediaControl
