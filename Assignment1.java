// Import libraries here
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Scanner word = new Scanner(System.in);
    
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


    //Farenheit to Celcius

    double number = 0.0;

    System.out.println("enter a number in Fahrenheit: ");

    number = scan.nextDouble();

    double celciusp1 = (number - 32);

    double celcius = celciusp1 * 5/9;

    System.out.println(celcius + " C");

    //5 characters string

    String String5;

    int stringSize = 0;

    System.out.println("Enter a 5 character word: ");

    String5 = word.nextLine();

    stringSize = String5.length();

    String reverse = new StringBuffer(String5).reverse().toString();

    System.out.println(reverse);

    String finishedSt = reverse.substring(1);

    System.out.println(finishedSt);

    //Create a random number

    Random r = new Random();

    int low = 32;

    int high = 16384;

    int randomNumber = r.nextInt(high-low) + low;

    System.out.println("Random Number being Generated");

    
    // Output the result


    System.out.println("Your new String is: " + celcius + "In the works" + randomNumber);

    scan.close();

  }
}
