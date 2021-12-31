package exercises.controlflow;

import java.util.ArrayList;
import java.util.Scanner;

public class Print5LetterWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word for the list: ");
        String word = input.nextLine();

        ArrayList<String> list = new ArrayList<>();

        if (word != "") {
            list.add(word);
        }
    }
}
