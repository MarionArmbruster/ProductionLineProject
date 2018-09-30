/***************************************************
 * Author: Marion Armbruster
 * Date: 29 September 2018
 * Item interface class is a group of related methods
 * with empty bodies that define some of the "behavior"
 * of any type of production item that may be created.
 * Behaviors include a final manufacturer string,
 * production number, product name, serial number,
 * and manufacture date.
 ****************************************************/


package productionline;

import java.util.Date;

public interface Item {

  // final for fields is redundant in an interface
  String manufacturer = "OracleProduction";

  // by default, all methods are public because of the interface type-class
  void setProductionNumber(int numberID);

  void setName(String n);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}// end of interface Item
