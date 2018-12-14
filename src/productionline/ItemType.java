/***************************************************
 * File: ItemType.java
 * Author: Marion Armbruster
 * Date: 29 September 2018
 ****************************************************/

package productionline;

/**
 * The ItemType class is an enum class that creates the
 * types of items with their argument objects
 * declared. The constructor passes its parameter
 * (of the object) to the field variable.
 *
 * @Author Marion Armbruster
 * @Author Professor Scott VanSelow for various assistance
 */
public enum ItemType {

  /* Item type constants (fields) declared with a specific string as an argument to the constructor.
     Similar to "ItemType AUDIO = new ItemType ("AU");", only using an enum class instead.*/
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  // private field
  private final String code;

  /**
   * An overloaded constructor that assigns each code when the constructor is called.
   *
   * @param code The type of enum that is passed when the constructor is called, such as AUDIO
   */
  ItemType(String code) {
    // Note: this.field name = parameter name
    this.code = code;
  }

  /**
   * A getter method for the stored identification of each enum constant, the argument of the enum
   * object.
   *
   * @return The code that was passed, i.e. VISUAL or AUDIO_MOBILE
   */
  public String getCode() {

    return code;
  }

} // end of ItemType enum class

