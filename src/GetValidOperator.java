import java.util.Scanner;

public class GetValidOperator {
  public static String getValidOperator(Scanner scanner) {
    String operator;

    while (true) {
      operator = scanner.next();

      if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
          || operator.equals("!")) {
        return operator;
      } else {
        System.err.println("Invalid operator: Please enter one of +, -, *, /, !");
      }
    }
  }
}
