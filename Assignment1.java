// Import libraries here
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Scanner word = new Scanner(System.in);
    double number = 0.0;
    String String5;
    char[] cArray = new char[10]; 
    int stringSize = 0;
    String finishedSt = "";
    String reverse = "";
    Random r = new Random();
    int low = 32;
    int high = 16384;

    
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

    

    System.out.println("enter a number in Fahrenheit: ");

    number = scan.nextDouble();

    double celciusp1 = (number - 32);

    double celcius = celciusp1 * 5/9;



    //5 characters string


    System.out.println("Enter a 5 character word: ");

    String5 = word.nextLine();

    stringSize = String5.length();

    reverse = new StringBuffer(String5).reverse().toString();

    finishedSt = reverse.substring(1, 4);


    //Create a random number

    int randomNumber = r.nextInt(high-low) + low;

    System.out.println("Random Number being Generated");

    
    // Output the result


    System.out.println("Your new String is: " + celcius + finishedSt + randomNumber);

    scan.close();

  }
}
