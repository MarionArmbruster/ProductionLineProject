/***************************************************
 * File: PlayerDriver.java
 * Author: Marion Armbruster
 * Date: 25 October 2018
 ****************************************************/

package productionline;

/**
 * A testing driver for Repl.it and for step 12 and
 * step 13 in the specifications from the oracle
 * exercise. A driver class that tests the functionality
 * of the movie player as well as the audio player.
 *
 * @Author Marion Armbruster
 * @Author Professor Scott VanSelow for various assistance
 */
public class PlayerDriver {

  /**
   * The method for the PlayerDriver class. It creates some AudioPlayer and MoviePlayer objects,
   * then calls the interface methods from each class.
   */
  public static void testPlayer() {

    MoviePlayer movie1 = new MoviePlayer("productName", new Screen("1024x249", 23, 56),
        MonitorType.LCD);
    MoviePlayer movie2 = new MoviePlayer("productName2", new Screen("800x480", 34, 78),
        MonitorType.LED);

    System.out.println(movie1);
    System.out.println(movie2);

    AudioPlayer audio1 = new AudioPlayer("i-pod", "mp3");

    // calls the methods from the AudioPlayer class
    audio1.next();
    audio1.play();
    audio1.previous();
    audio1.stop();

    // calls the methods from the MoviePlayer class
    movie1.next();
    movie1.play();
    movie1.previous();
    movie1.stop();
  }

}
