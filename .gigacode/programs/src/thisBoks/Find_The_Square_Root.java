package thisBoks;

import java.util.Scanner;

public class Find_The_Square_Root { // найти квадратный корень
    public static void main(String[] args) {

        double inputNumber = readNumber(" Enter a non-negative number");
        double squareRoot = Math.sqrt(inputNumber);
        System.out.println("The square root of " + inputNumber +" is: "+squareRoot);

    }
    public static double readNumber(String prompt){

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();

            try{
                double number =Double.parseDouble(input);
                if (number >= 0){
                    return number;
                }else {
                    System.out.println(" Please enter a non-negative number");
            }
        }catch (NumberFormatException e){
                System.out.println("Please enter a valid number: ");
            }
    }
}}
