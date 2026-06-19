package thisBoks;

import java.util.Scanner;

public class ConvertCelsius8 {

    public static double readNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try{
                return Double.parseDouble(input);
            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number");
            }
        }
    }
    public static void main(String[] args) {
        double celsius = readNumber("Please enter a temperature in Celsius");

        double farengeit = (celsius * 9.0)/5.0 + 32.0;

        System.out.println("temperature in Farengeit = " + farengeit);
    }
}
