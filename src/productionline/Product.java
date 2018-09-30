/***************************************************
 * Author: Marion Armbruster
 * Date: 29 September 2018
 * The Product class is an abstract class, and as
 * such cannot have any subclass and cannot be used
 * to create any objects of its type. It implements
 * the Item interface and completes its methods for
 * use in the program.
 *
 * This program is based from specifications from
 * an oracle exercise
 ****************************************************/


package productionline;

import java.util.Date;

public abstract class Product implements Item {

  /*Appears to be a misplaced variable or poor specification, as this (when not commented out)
   *prevents the private field in the interface from being called/used and therefore causes
   *"manufacturer" is the toString method to display "null".
   String manufacturer;*/

  // instance variables
  private String name;
  private Date manufacturedOn;
  private int serialNumber;

  // class field
  private static int currentProductionNumber;

  /*constructor for product that takes in the name of the product and sets to the field variable
   * name. Assigns a serial number from the currentProductionNumber, tagged with the date/time
   * of production. The currentProductionNumber is incremented in readiness for the next called
   * instance of the constructor. */
  public Product(String productName) {

    name = productName;
    serialNumber = currentProductionNumber;

    /* FindBugs plugin says: "Write to static field from instance method." This instance method
     * writes to a static field and is generally considered bad practice. This is considered a
     * "High Confidence Dodgy code". A misuse of static fields.*/
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  // implementation of interface methods
  public void setProductionNumber(int numberID) {
    /* FindBugs plugin says: "Write to static field from instance method." This instance method
     * writes to a static field and is generally considered bad practice. This is considered a
     * "High Confidence Dodgy code". A misuse of static fields.*/
    currentProductionNumber = numberID;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    /* FindBugs plugin says that this method "Returns a reference to a mutable object value
     * stored in one of the object's fields and exposes the internal representation of the object.
     * It is called a Medium Confidence Malicious code vulnerability.*/
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  // overridden toString method from class Object that outputs the product information
  public String toString() {
    // FindBugs plugin says: "Format string should use %n rather than \n".
    return String.format("Manufacturer  : %s%nSerial Number : %s%nDate          : %s%n"
        + "Name          : %s%n", manufacturer, serialNumber, manufacturedOn, name);
  }

}
