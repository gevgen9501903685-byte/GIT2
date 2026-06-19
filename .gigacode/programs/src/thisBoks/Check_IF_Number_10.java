package thisBoks;

import java.util.Scanner;

public class Check_IF_Number_10 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextDouble()){
            double number = scanner.nextDouble();
            if (number > 0.0){
                System.out.println(number + " is a positive number");
            } else if (number < 0.0) {
                System.out.println(number +" is a negativ number");
            }else {
                System.out.println(" The entered number is zero");
            }
        }else {
            System.out.println("Please enter a valid number");
        }
        scanner.close();
    }
}
