/***************************************************
 * File: Product.java
 * Author: Marion Armbruster
 * Date: 29 September 2018
 *
 * The Product class is an abstract class, and as
 * such cannot have any subclass and cannot be used
 * to create any objects of its type. It implements
 * the Item interface and completes its methods for
 * use in the program. As well, it uses the Comparable
 * interface in order to compare Product items and
 * to give the functionality of sorting those items.
 *
 * This program is based from specifications and
 * instructions from an oracle exercise.
 ****************************************************/

package productionline;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  // instance variables
  private String manufacturer = Item.manufacturer;
  private String name;
  private Date manufacturedOn;
  private int serialNumber;

  // class field
  private static int currentProductionNumber = 1;

  /**
   * An overloaded constructor for the Class Product that takes in the name of the product and sets
   * it to the field variable name. Assigns a serial number from the currentProductionNumber, tagged
   * with the date/time of production. The currentProductionNumber is incremented in readiness for
   * the next called instance of the constructor.
   *
   * @param productName The name of the product, passed in from an argument.
   */

  public Product(String productName) {

    name = productName;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
    /* FindBugs plugin says: "Write to static field from instance method." This instance method
     * writes to a static field and is generally considered bad practice. This is considered a
     * "High Confidence Dodgy code". A misuse of static fields.*/
  }

  // The implementation of the interface methods.

  /**
   * A setter method that has one integer parameter and assigns it to the class field current
   * production number.
   *
   * @param numberId The production number of the product.
   */

  @Override
  public void setProductionNumber(int numberId) {
    currentProductionNumber = numberId;
    /* FindBugs plugin says: "Write to static field from instance method." This instance method
     * writes to a static field and is generally considered bad practice. This is considered a
     * "High Confidence Dodgy code". A misuse of static fields.*/
  }

  /**
   * A setter method that has one string parameter and assigns it to the instance variable "name".
   *
   * @param prodName The product name to be set, passed in by an argument.
   */

  @Override
  public void setName(String prodName) {
    name = prodName;
  }

  /**
   * A getter method that returns the String "name" from the instance variable.
   *
   * @return The name of the product
   */

  @Override
  public String getName() {
    return name;
  }

  /**
   * A getter method that returns the computer generated date/time group at the time the product is
   * created.
   *
   * @return The manufactured-on date in the format of Day/Month/Date/TimeStandard/Year.
   */

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
    /* FindBugs plugin says that this method "Returns a reference to a mutable object value
     * stored in one of the object's fields and exposes the internal representation of the object.
     * It is called a Medium Confidence Malicious code vulnerability.*/
  }

  /**
   * A getter method that returns the integer from the instance variable that is assigned to each
   * individual product, in the numerical order as it is created.
   *
   * @return The integer serial number of the product.
   */

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * A compareTo method that compares objects of Product, specially the "name" field to another
   */

  @Override
  public int compareTo(Product object) {
    return name.compareTo(object.getName());
  }

  /**
   * An overridden toString method from class Object that returns a formatted output string
   * displaying two columns with the manufacturer name, serial number, date created, and the name of
   * the product.
   *
   * @return The String to display the information.
   */
  public String toString() {
    return String.format("Manufacturer  : %s%nSerial Number : %s%nDate          : %s%n"
        + "Name          : %s%n", manufacturer, serialNumber, manufacturedOn, name);
  }


} // end of abstract Product class
