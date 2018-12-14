/***************************************************
 * File: Item.java
 * Author: Marion Armbruster
 * Date: 29 September 2018
 ****************************************************/

package productionline;

import java.util.Date;

/**
 * The Item interface class is a group of related methods
 * with empty bodies that define some of the "behavior"
 * of any type of production item that may be created.
 * Behaviors include a final manufacturer string,
 * production number, product name, serial number,
 * and manufacture date.
 *
 * @Author Marion Armbruster
 * @Author Professor Scott VanSelow for various assistance
 */
public interface Item {

  // Note: final for fields is redundant in an interface
  String manufacturer = "OracleProduction";

  // by default, all methods are public because of the interface type-class

  /**
   * The setter method that will set the product's production number.
   *
   * @param numberId The production number ("1", "2" etc) as the product is produced.
   */
  void setProductionNumber(int numberId);

  /**
   * The setter method that will set the product name.
   *
   * @param prodName The full product name.
   */
  void setName(String prodName);

  /**
   * The getter method for the product name that was set.
   *
   * @return The name of the product.
   */
  String getName();

  /**
   * A getter method that gives the date of the product.
   *
   * @return The date generated when the product is created.
   */
  Date getManufactureDate();

  /**
   * A getter method that gets the serial number for each individual product, in the numerical order
   * as it is created.
   *
   * @return The integer serial number of the product.
   */
  int getSerialNumber();

} // end of interface Item
