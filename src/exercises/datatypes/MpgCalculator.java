package exercises.datatypes;

import java.util.Scanner;

public class MpgCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallons;

        System.out.println("Enter the number of miles driven: ");
        miles = input.nextInt();
        System.out.println("Enter the number of gallons used: ");
        gallons = input.nextInt();
        input.close();

        int mpg = miles / gallons;

        System.out.println("Your miles per gallon was " + mpg + ".");
    }
}
