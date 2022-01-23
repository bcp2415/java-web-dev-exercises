package exercises;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = input.nextLine();
        input.close();

        System.out.println("Hello, " + name + ".");
        */
        char myChar = 'D';
        char myUnicodeChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        String test = "\u0044";
        System.out.println(test);
    }
}
