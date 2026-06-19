package thisBoks;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = readNumber(scanner, "Enter the first number");
        double num2 = readNumber(scanner, "Enter the second number");

        double result = num1 + num2;
        System.out.println("Result amount: " + result);
    }

    public static double readNumber(Scanner scanner, String prompt) {

        System.out.println(prompt);
        String input = scanner.nextLine();
        return Double.parseDouble(input);

    }
}