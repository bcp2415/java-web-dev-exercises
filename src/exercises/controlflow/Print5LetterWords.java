package exercises.controlflow;

import java.util.ArrayList;
import java.util.Scanner;

public class Print5LetterWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String word;

        System.out.println("Enter a word for the list, or press ENTER to finish adding words: ");
        do {

            word = input.nextLine();

            if (word != "") {
                list.add(word);
            }
        } while (word != "");

        System.out.println("Your list contains the following five-letter words: ");
        for (String item : list) {

            if (item.length() == 5) {
                System.out.println(item);
            }
        }
    }
}
