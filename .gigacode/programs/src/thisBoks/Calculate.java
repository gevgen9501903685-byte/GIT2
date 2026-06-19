package thisBoks;

import java.util.Scanner;

public class Calculate {
    public static double readPositiveNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Please enter valid positive number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }

        }
    }

    public static void main(String[] args) {
        double basa = readPositiveNumber("Enter the base of the triangle: ");
        double height = readPositiveNumber("Enter the height  of the triangle: ");

        double area = 0.5 * basa * height;

        System.out.printf("The area of the triangle wis base %.1f and height %.1f%n is: %.1f%n", basa,height,area);
    }
}