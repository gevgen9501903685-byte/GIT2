package thisBoks;

import java.util.Scanner;

public class ConvertKilo7 {

    public static double readNumber(String prompt){
        Scanner scanner =new Scanner(System.in);

        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Double.parseDouble(input);
            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number");
            }
        }

    }
    public static void main(String[] args) {

        double kilometr = readNumber("Please enter kilometers ");
        double kiloToMile = 0.621371;

        double mile = kilometr * kiloToMile;
        System.out.println("kilometr = " + mile + " mile");
    }
}
