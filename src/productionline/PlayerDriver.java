/***************************************************
 * File: PlayerDriver.java
 * Author: Marion Armbruster
 * Date: 25 October 2018
 *
 * A testing driver for Repl.it and for step 12 and
 * step 13 in the specifications from the oracle
 * exercise. A driver class that tests the functionality
 * of the movie player as well as the audio player.
 ****************************************************/

package productionline;

public class PlayerDriver {

  public static void testPlayer() {

    MoviePlayer movie1 = new MoviePlayer("productName", new Screen("1024x249", 23, 56),
        MonitorType.LCD);
    MoviePlayer movie2 = new MoviePlayer("productName2", new Screen("800x480", 34, 78),
        MonitorType.LED);

    System.out.println(movie1);
    System.out.println(movie2);

    AudioPlayer audio1 = new AudioPlayer("i-pod", "mp3");

    audio1.next();
    audio1.play();
    audio1.previous();
    audio1.stop();

    movie1.next();
    movie1.play();
    movie1.previous();
    movie1.stop();
  }

}
