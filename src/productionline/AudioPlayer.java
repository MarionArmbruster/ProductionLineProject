/***************************************************
 * File: AudioPlayer.java
 * Author: Marion Armbruster
 * Date: 5 October 2018
 ****************************************************/

package productionline;

/**
 * The AudioPlayer normal class Implements the interface Multimedia Control and is a child class of
 * Product. It defines and uses the methods of Multimedia Control and is a more specific type of
 * product.
 *
 * @Author Marion Armbruster
 * @Author Professor Scott VanSelow for various assistance
 */
public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  // Does not need a default constructor because an object won't be created without this needed info

  /**
   * An overloaded constructor that takes in the name of the product and uses the parent constructor
   * to implement what is entered, sets the media type to a certain type of the enum class, and
   * assigns the audio spec of the specific item that is chosen i.e. ipod is an mp3 format.
   *
   * @param name The name of the audio device.
   * @param auSpec The type of file format the device uses
   */
  public AudioPlayer(String name, String auSpec) {
    // calling the parent constructor (super)
    super(name);
    audioSpecification = auSpec;
    mediaType = ItemType.AUDIO_MOBILE;
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what "play"
   * does specifically for the audio type.
   */
  @Override
  public void play() {
    System.out.println("Playing song");
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what "stop"
   * does specifically for the audio type.
   */
  @Override
  public void stop() {
    System.out.println("Stopping song");
  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what
   * "previous" is and what it does specifically for the audio type.
   */
  @Override
  public void previous() {
    System.out.println("GoTo Previous song");

  }

  /**
   * A method that displays the implementation of the Multimedia Control's method for what "next" is
   * and what it does specifically for the audio type.
   */
  @Override
  public void next() {
    System.out.println("GoTo Next song");

  }

  /**
   * An overridden toString method calls the parent toString method to display both statements from
   * each class. AudioPlayer's toString is appended to the end of Product's toString.
   *
   * @return The String to display the specific Audio device file format and the device's type
   *         information.
   */
  @Override
  public String toString() {
    return super.toString() + "Audio Spec    : " + audioSpecification + "\n Type          : "
        + mediaType + "\n";
  }

}
