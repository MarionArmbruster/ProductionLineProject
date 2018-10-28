/***************************************************
 * File: ScreenSpec.java
 * Author: Marion Armbruster
 * Date: 6 October 2018
 *
 * An interface that holds the defining features, or
 * specifications, of a screen as methods that
 * cannot be implemented in this interface and must
 * be implemented in any class that implements this
 * interface. This interface include a screens's
 * resolution, its screen refresh rate, and its
 * response time.
 ****************************************************/

package productionline;

public interface ScreenSpec {

  String getResolution();

  int getRefreshRate();

  int getResponseTime();

}
