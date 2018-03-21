/*
 * Seth James England
 * February 27, 2018
 */

package billofsale;

/**
 * Seth England
 */
public class Billofsale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this is to define the variables for the program
        double shirt = 12.49;
        double payment = 20;
        double tax = .13;
        double shirttax = shirt*tax;
        double change = payment - shirt;
        // this is the section of code that rpints the recipt
      System.out.println("Cost of the shirt = " + shirt + "$" );
      System.out.println("Tax = " + shirttax + "$" );
      System.out.println("Shirt including tax = " + (shirt + shirttax));
      System.out.println("Amount paid = " + payment + "$");
      System.out.println("Change recieved = " + change + "$");

    }
    
}
