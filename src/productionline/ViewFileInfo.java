/***************************************************
 * File: ViewFilesInfo.java
 * Author: Marion Armbruster
 * Date: 16 November 2018
 ****************************************************/

package productionline;

import java.io.FileReader;
import java.io.IOException;

/**
 * This class takes the file(s) that was created and outputs into the console.
 */
public class ViewFileInfo {

  /**
   * This method reads through the file specified and outputs to the console.
   */
  public void viewFile() throws IOException {

    FileReader fr = null;
    try {
    /*FindBugs says that this "Code contains a hard coded reference to an absolute pathname" as
    well as "Found reliance on default encoding: new java.io.FileReader(String)," however, due to
    the specifications given, this is how the program needs to be run.*/
      fr = new FileReader("C:\\LineTest\\TextResults.txt");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
      fr.close();
      /*FindBugs says that "viewFile() may fail to clean up java.io.Reader on checked exception"*/
    } catch (Exception ex) {
      System.out.println("Problem in reading file.");
      /*Findbugs says that the "Exception is caught when Exception is not thrown", however, the code
       is in a try-catch; If fileReader could not proceed, it would throw the exception. So, I
       really don't understand how Findbugs could be complaining about this at all.*/
      fr.close();
      /*While trying to fix the "viewFile() may fail to clean up java.io.Reader on checked
       exception" error, Findbugs gave "Possible null pointer dereference of fr on exception path"
       instead. It is not possible for this close method to be a null pointer.*/
    }

  } // end of viewFile method

} // end of ViewFileInfo class
