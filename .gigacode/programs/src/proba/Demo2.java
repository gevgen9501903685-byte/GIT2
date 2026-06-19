package proba;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        calc calc = new calc();
        calc.Ent();


    }
}
class calc{
    Scanner scanner = new Scanner(System.in);

    public void Ent() {
        Double num1 = Enter(scanner, "enter num1");
        Double num2 = Enter(scanner, "enter num2");
        Double amount = num1 * num2;
        System.out.println(amount);
        scanner.close();
    }
    private static double Enter(Scanner scanner, String prompt){

        while (true ) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
            if(Double.parseDouble(input) > 5 || Double.parseDouble(input) < 100)
                return Double.parseDouble(input);}
            catch (NumberFormatException e){
                System.out.println("mistake");
            }
        }
    }

}