package thisBoks;

import java.util.Scanner;

public class SwapVariables {

    public static String readInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
        String variable1 = readInput("Enter the first variable");
        String variable2 = readInput("Enter the second variable");
        System.out.println("Before swapping: Variable1 = " + variable1 +"\n" + "Variable2 = " + variable2);

        String temp = variable1;
        variable1 = variable2;
        variable2 = temp;
        System.out.println("After swapping: Variable1 = " + variable1 +"\n" + "Variable2 = " + variable2);
    }
}
