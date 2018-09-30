/***************************************************
 * Author: Marion Armbruster
 * Date: 29 September 2018
 * ItemType class is an enum class that creates the
 * types of items with their argument objects
 * declared. The constructor passes its parameter
 * (of the object) to the field variable.
 ****************************************************/

package productionline;

public enum ItemType {

  // item type constants (fields) declared with a specific string as an argument to the constructor
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  // private field
  private final String code;

  // constructor for assigning each code
  ItemType(String code) {
    // this.field name = parameter/argument name
    this.code = code;
  }

  // accessor method for the stored identification (the argument of the enum object
  public String getCode() {

    return code;
  }

}// end ItemType enum class

