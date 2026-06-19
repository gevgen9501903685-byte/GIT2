package thisBoks;

import static thisBoks.ConvertKilo7.readNumber;

public class proba {
    public static void main(String[] args) {

        double kilometr = readNumber("Please enter kilometers ");
        double kiloToMile = 0.621371;

        double mile = kilometr * kiloToMile;
        System.out.println("kilometr = " + mile + " mile");
    }


}
