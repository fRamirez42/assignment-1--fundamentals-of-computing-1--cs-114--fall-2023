// Import libraries here
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

    Scanner scan = new Scanner(System.in);

    System.out.println("enter a number in Fahrenheit: ");

    double number = scan.nextDouble();

    double celciusp1 = (number - 32);

    double celcius = celciusp1 * 5/9;

    //5 characters string

    String javaString;

    System.out.println("Enter a 5 character word: ");

    javaString = scan.nextLine();

    int stringSize = javaString.length();

    System.out.println(stringSize);

  }
}
