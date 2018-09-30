/***************************************************
 * Author: Marion Armbruster
 * Date: 29 September 2018
 * A testing driver class for this on-going project
 * is needed as the exercise specifications have not
 * yet declared that a normal driver class be made.
 * This driver class is also necessary due to the
 * abstract class, since that class by itself cannot
 * instantiate objects, and thus cannot test the
 * program.
 ****************************************************/

package productionline;

public class Main {

  public static void main(String[] args) {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

  }

}

class Widget extends Product {

  public Widget(String name) {
    super(name);
  }

}