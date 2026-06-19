package thisBoks;

import java.util.Scanner;

public class SolveQuadratic {

    public static Double readNumber(String prompt){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println(prompt);
            String input = scanner.nextLine();
            try {
                return  Double.parseDouble(input);
            }catch (NumberFormatException e){
                System.out.println("Please enter a valid number ");
            }
        }
    }

    public static void main(String[] args) {
        double a = readNumber("Enter coefficient a: ");
        double b = readNumber("Enter coefficient b: ");
        double c = readNumber("Enter coefficient c: ");

        double discriminant = Math.pow(b,2) - 4 *a*c;
        System.out.println(discriminant);
        if (a == 0){
            System.out.println("Coefficient zero");
            return;
        }
        if(discriminant < 0){
            double sq = Math.sqrt(discriminant);
            System.out.println(sq);

        }
    }
}
