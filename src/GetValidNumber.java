import java.util.Scanner;

public class GetValidNumber {

  public static double getValidNumber(Scanner scanner) {

    while (!scanner.hasNextDouble()) {
      System.err.println("Invalid number: Please enter a valid number");
      scanner.next();
    }

    return scanner.nextDouble();
  }
}
