public class Factorial {
  public static int factorial(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Invalid number: Number must not be negative");
    }
    int finalResult = 1;
    while (number > 0) {
      finalResult *= number;
      number--;
    }
    return finalResult;
  }
}
