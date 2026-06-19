package thisBoks;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double num1 = readNumber(scanner, "Enter the first digit");
        double num2 = readNumber(scanner, "Enter the second digit");

        double sumResult = num1 + num2;
        System.out.printf("The sum of %.1f and %.1f is: %.2f%n", num1,num2,sumResult);
        scanner.close();

    }
    private static double readNumber(Scanner scanner, String prompt){
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return  Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
