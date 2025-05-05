import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double first = input.nextDouble();

        System.out.print("Enter the second value: ");
        double second = input.nextDouble();

        System.out.print("Select an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double output;

        switch (operator) {
            case '+':
                output = first + second;
                break;
            case '-':
                output = first - second;
                break;
            case '*':
                output = first * second;
                break;
            case '/':
                if (second != 0) {
                    output = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Unsupported operator.");
                return;
        }

        System.out.println("The result is: " + output);
    }
}
