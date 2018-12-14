/***************************************************
 * File: TestProductionLine.java
 * Author: Marion Armbruster
 * Date: 4 November 2018
 *       Revised 16 November 2018
 *       Revised 10 December 2018
 ****************************************************/

package productionline;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is used to test the functionality and the output of the EmployeeInfo class and
 * read/write all the Product data to a file in the directory created.
 */
public class TestProductionLine {

  /**
   * A method that tested the EmployeeInfo class during production of this program up to step 18, as
   * well as testing final production results for step 23.
   *
   * @param in A scanner passed in from either the main method or another method to be used in the
   *           EmployeeInfo class that is called.
   */
  public static void stepEighteen(Scanner in) {
    EmployeeInfo anEmp = new EmployeeInfo(in);
    System.out.println(anEmp);
  }

  /**
   * This method creates an object of the ProcessFiles class and uses it to write the objects within
   * the ArrayList to a text file in a directory designated by the ProcessFiles class. It calls the
   * overloaded method in the ProcessFiles class to also write the information that was taken from
   * the user's input and stored in the EmployeeInfo class's object.
   *
   * @param in A scanner object passed in from the main method to be used as necessary in any
   *           classes called from this method that need to take input from the console.
   * @param products The ArrayList of type Product that holds all the objects created.
   */
  public static void testProductionMethod(Scanner in, ArrayList<Product> products) {

    // an object of the class that calls the constructor
    ProcessFiles pf = new ProcessFiles();

    try {
      pf.writeToFile(products);
    } catch (Exception e) {
      System.out.println("Problem writing to file(List).");
    }

    EmployeeInfo someEmp = new EmployeeInfo(in);

    try {
      pf.writeToFile(someEmp);
    } catch (Exception e) {
      System.out.println("Problem writing to file(emp).");
    }

  } // end of testProductionMethod

} // end of TestProductionLine class
