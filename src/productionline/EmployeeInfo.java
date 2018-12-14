/***************************************************
 * File: EmployeeInfo.java
 * Author: Marion Armbruster
 * Date: 4 November 2018
 *       Revised: 10 December 2018
 ****************************************************/

package productionline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A class that allows the user to input their full name and then creates a user id of their first
 * initial and surname. This will be used in creating an audit trail on the tests of the production
 * line so that it records which employee ran the test.
 */
public class EmployeeInfo {

  // private fields used in this class
  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern thePattern;

  /**
   * The constructor for this class. It creates a chain of method calls to retrieve input from the
   * the user for an employee name, which is then used to create a employee identification code. It
   * also does the same in order to obtain a user-inputted department identification that conforms
   * to the specifications outlined by the Pattern.
   */
  public EmployeeInfo(Scanner in) {
    setName(in);
    thePattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setDeptId(in);
  }

  /**
   * A getter method that retrieves the name of the employee that was entered.
   *
   * @return The name of the employee in the field variable.
   */
  public StringBuilder getName() {
    return this.name;
  }

  /**
   * A getter method that retrieves the identification code of the employee.
   *
   * @return The code id of the employee to the field variable.
   */
  public String getCode() {
    return this.code;
  }

  /**
   * A method that is an intermediate step between the input name method and the create employee
   * code method. This method calls both methods and is responsible for changing the String object
   * into a String Builder object for ease of manipulating that same object.
   */
  private void setName(Scanner in) {
    String namestr = inputName(in);
    name = new StringBuilder(namestr);
    createEmployeeCode(name);
  }

  /**
   * This method tests that validity of the name that entered. If it is valid (true), it is assigned
   * to code in the specified format. If it is not valid (false), code is assigned a default string
   * of characters.
   *
   * @param name The name of the employee that was entered.
   */
  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) {
      // if the check name method is true, then code has the first initial of the first name and
      // the full last name provided by the input given by the user
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "guest";
    }
  } // end of createEmployeeCode method

  /**
   * A method that prompts the user for an employee name, takes the input from the keyboard, and
   * assigns it to the local String variable to be returned.
   *
   * @return A String-type object called namestr that holds the string of characters that the user
   *         entered. It is preferably a name with one space in between the first name and last
   *         name.
   */
  private String inputName(Scanner in) {
    System.out.print("Enter your employee name as first name then last name: ");
    String namestr = in.nextLine();
    return namestr;
  }

  /**
   * A method that is passed the name of the employee entered as a StringBuilder object and
   * validates the object using two conditions.
   *
   * @param name The name of the employee entered.
   * @return Either True or False, depending on whether name passes both conditions or not.
   */
  private boolean checkName(StringBuilder name) {
    // if name has at least three characters and the space character is greater
    // than index position 0, then the input is valid.
    if (name.indexOf(" ") > 0 && name.length() >= 3) {
      return true;
    } else {
      return false;
    }
  } // end of checkName method

  /**
   * A method that prompts the user for a department identification in the specified format.
   *
   * @return A String called anID, the user's input, which should be the department identification.
   */
  public String getDeptId(Scanner in) {
    System.out.print("Enter a Dept identification (must be in the form of capital letter, three"
        + " lowercase letters, two numbers): ");
    String anId = in.nextLine();
    return anId;
  }

  /**
   * A method that is called from the constructor, it calls the method that gets the department
   * identification from the user and stores it in a local variable, which is then passed to a
   * validity method to ensure that the id matches the Pattern. The validation method's boolean is
   * only used inside itself (boolean returned is not used). The set department identification
   * method also closes the Scanner object.
   */
  private void setDeptId(Scanner in) {
    String someId = getDeptId(in);
    boolean isValid = validId(someId);
    /*FindBugs says that this is a dead store to the variable, as the boolean value is not used in
     anything. However, in the if-else in ValidId, I needed to return a boolean value. There is no
     necessary usage of this boolean beyond that. I could not simply return the string variable
     that called the next method.*/
  }

  /**
   * A getter method that retrieves the department identification of the employee.
   *
   * @return The department identification of the employee to its field variable.
   */
  public String getId() {
    return this.deptId;
  }

  /**
   * A method that tests the input from the user against the Pattern that has been specified. If the
   * test is true, the method to reverse the string is called. It also assigns the String to the
   * field variable.
   *
   * @param id The String containing the department identification to be tested.
   * @return Either True or False; if True, the method to reverse the characters is called and that
   *         is assigned to the field variable. If False, a default String is assigned to the field
   *         variable.
   */
  private boolean validId(String id) {
    Matcher isMatch = thePattern.matcher(id);
    if (isMatch.matches()) {
      deptId = reverseString(id);
      return true;
    } else {
      deptId = "None01";
      return false;
    }
  } // end of ValidId

  /**
   * A method that uses recursion to reverse the characters of a String. The method takes each
   * character by using the length of the String and adds it to itself while also calling itself
   * (the method) in order to add the next character from the end of the String.
   *
   * @param id the String that contains the department identification to be reversed.
   * @return The final return is the department identification reversed, the second is the recursion
   */
  public String reverseString(String id) {
    char idChar = id.charAt(id.length() - 1);
    if (id.length() == 1) {
      return Character.toString(idChar);
    } else {
      return idChar + reverseString(id.substring(0, id.length() - 1));
    }
  } // end of reverseString

  /**
   * A toString method that displays the data held in the code and department identification field
   * variables. Accessed through the getter methods.
   *
   * @return The values stored in each respective field variable.
   */
  @Override
  public String toString() {
    return String.format("%nEmployee Code : %s%nDepartment    : %s%n", getCode(), getId());
  }

} // end of EmployeeInfo class
