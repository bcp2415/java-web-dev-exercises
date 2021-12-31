package exercises.datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opening = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a word to search for in the opening sentence of 'Alice in Wonderland'.");
        String search = input.next().toLowerCase();
        input.close();

        boolean answer = opening.toLowerCase().contains(search);
        System.out.println(answer);

        if (answer == true) {
            System.out.println("The index of the word " + search + " in the opening sentence is " + opening.indexOf(search) + ".");
            System.out.println("The length of the word you searched for is " + search.length() + " characters.");

            int firstIndex = opening.indexOf(search) - 1;
            int length = search.length();
            int secondIndex = opening.indexOf(search) + length;
            int lastIndex = opening.length() -1;
            String snipped = opening.substring(0, firstIndex) + opening.substring(secondIndex, lastIndex);
            System.out.println(snipped);
        }
    }
}
