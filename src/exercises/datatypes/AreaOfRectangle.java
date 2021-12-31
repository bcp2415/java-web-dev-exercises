package exercises.datatypes;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rectangle's length: ");
        float length = input.nextFloat();

        System.out.println("Enter the rectangle's width: ");
        float width = input.nextFloat();
        input.close();

        float area = length * width;

        System.out.println("The area of a rectangle with " + length + " length, and with " + width + " width, is " + area + ".");

    }
}
