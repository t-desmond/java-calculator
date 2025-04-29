import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = GetValidNumber.getValidNumber(scanner);

        System.out.print("Enter the operator: ");
        String operator = GetValidOperator.getValidOperator(scanner);

        double secondNumber = 0;
        if (!operator.equals("!")) {
            System.out.print("Enter the second number: ");
            secondNumber = GetValidNumber.getValidNumber(scanner);
        }
        
        scanner.close();

        try {
            double result = solve(firstNumber, operator, secondNumber);
            if (operator.equals("!")) {
                System.out.println(firstNumber + "! = " + result);
            } else {
                System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double solve(double firstNumber, String operator, double secondNumber) {
        switch (operator) {
            case "+":
                Adder.adder(firstNumber, secondNumber);
            case "-":
                Subtractor.subtractor(firstNumber, secondNumber);
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return firstNumber / secondNumber;
            case "!":
                return Factorial.factorial( (int) firstNumber);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
