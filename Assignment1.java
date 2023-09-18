// Import libraries here
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    
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

    Scanner scan = new Scanner(System.in);

    System.out.println("enter a number in Fahrenheit: ");

    number = scan.nextDouble();

    double celciusp1 = (number - 32);

    double celcius = celciusp1 * 5/9;

    System.out.println(celcius + " C");


    //5 characters string

    String String5;

    int stringSize = 0;

    //while(stringSize != 5){ 

    System.out.println("Enter a 5 character word: ");

    String5 = scan.nextLine();

    stringSize = String5.length();

    //}

    System.out.println(stringSize);
    

    //Create a random number

    Random r = new Random();

    int low = 32;

    int high = 16384;

    int result = r.nextInt(high-low) + low;

    System.out.println(result);


  }
}
