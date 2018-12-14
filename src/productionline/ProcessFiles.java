/***************************************************
 * File: ProcessFiles.java
 * Author: Marion Armbruster
 * Date: 16 November 2018
 ****************************************************/

package productionline;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * This class creates a file and directory, and writes to that file the employee's information from
 * the EmployeeInfo class and the pre-defined ArrayList created from the CollectionsTest class.
 */
public class ProcessFiles {

  private Path path;
  private Path path2;
  private Path path3;

  /**
   * The default constructor where the directory and  a file is created at the same time as the
   * object.
   */
  public ProcessFiles() {
    /*FindBugs says that this "Code contains a hard coded reference to an absolute pathname",
    however, due to the specifications given, this is how the program needs to be run.*/
    path = Paths.get("C:\\LineTests");
    path2 = Paths.get("ResultsMarionArmbruster.txt");
    path3 = path.resolve(path2);
    createDirectory();
  }

  /**
   * A method that tests for the existence of a directory path, and if not, creates it.
   */
  private void createDirectory() {

    try {
      if (Files.notExists(path)) {
        Files.createDirectory(path);
        System.out.println("Directory created.");
      } else {
        System.out.println("Directory already exists.");
      }

    } catch (Exception e) {
      System.out.println("Problem creating directory.");
    }
  }

  /**
   * This method writes to the file created, using the class EmployeeInfo and its information.
   *
   * @param emp An object that stores the information inputted from the EmployeeInfo class.
   * @throws IOException Standard exception in case something goes wrong with the input or output.
   */
  public void writeToFile(EmployeeInfo emp) throws IOException {
    /*FindBugs says "Found reliance on default encoding: new java.io.FileWriter(String, boolean),"
      however, this is a normal use of the FileWriter class.*/
    FileWriter writer = new FileWriter(path3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp);

    printWriter.close();

  }

  /**
   * This overloaded method writes to the file created, using the filled ArrayList that was passed
   * back from either the CollectionsTest class or another class, or another method such as main.
   *
   * @param products The ArrayList that contains all of the objects for the products created; each
   *                 object contains multiple pieces of information about the individual product.
   * @throws IOException Standard exception in case something goes wrong with the input or output.
   */
  public void writeToFile(ArrayList<Product> products) throws IOException {
     /*FindBugs says "Found reliance on default encoding: new java.io.FileWriter(String, boolean),"
       however, this is a normal use of the FileWriter class.*/
    FileWriter writer = new FileWriter(path3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(products);

    printWriter.close();
  }
}
