package thisBoks;

import java.util.Random;
import java.util.Scanner;

public class Generator_Number_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum value of the range: " );

        double minRange = scanner.nextDouble();
        System.out.println("Enter maximum value of the range: ");

        double maxRange = scanner.nextDouble();


        if (minRange < maxRange){
            Random random = new Random();

            double randomNumber = minRange + (maxRange - minRange) * random.nextDouble();
            System.out.println("randomNuber is: " + randomNumber);
        }else {
            System.out.println("Please enter valid number");
    }
}}
