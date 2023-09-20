// Import libraries here
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {

  public static void main(String[] args) {

    //Variables

    Scanner scan = new Scanner(System.in);
   

    double celciusp1;
    double celcius;
    double numberInput;

    String StringInput;
    String finishedSt;
    String reverse;

    Random r = new Random();
    final int LOW = 32;
    final int HIGH = 16384;
    int randomNumber;

    //****************************************************************************** */
    
    //Block names to be put here

    System.out.println("FFFFFFFFF   RRRRRRRRRR");
    System.out.println("FF          RR       RR");
    System.out.println("FF          RR       RR");
    System.out.println("FFFFFF      RR      RR");
    System.out.println("FF          RRRRRRRR");
    System.out.println("FF          RR     RR");
    System.out.println("FF          RR      RR");
    System.out.println("FF          RR       RR");
    System.out.println();


    //****************************************************************************** */

    //Farenheit to Celcius change


    System.out.println("enter a number in Fahrenheit: ");

    numberInput = scan.nextDouble();

    celciusp1 = (numberInput - 32);

    celcius = celciusp1 * 5/9;


    //****************************************************************************** */

    //5 characters string

    
    System.out.println("Enter a 5 character word: ");

    StringInput = scan.next();

    reverse = new StringBuffer(StringInput).reverse().toString();

    finishedSt = reverse.substring(1, 4);

    //***************************************************************************** */


    //Create a random number

    randomNumber = r.nextInt(HIGH-LOW) + LOW;

    System.out.println("Random Number being Generated...");


    // //**************************************************************************** */

    // Output the result


    System.out.println("Your new String is: " + celcius + finishedSt + randomNumber);

    scan.close();

    //**************************************************************************** */

  }
}
