package thisBoks;

import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        double digit = readNumber("Enter digit");
        System.out.println("it is digit: " + digit);


    }
    public static double readNumber(String prompt) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);

            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);
                if (number > 0) {
                    return number * 2;   /// это прикол не надо умножать
                } else {
                    System.out.println("Не правильная цифра");
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid digit");
            }
        }
    }}