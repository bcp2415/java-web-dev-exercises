package exercises.controlflow;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintWordsWithLengthChosenByUser {
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

        int length;
        System.out.println("Enter the length of the words you want to find in the list: ");
        length = input.nextInt();
        input.close();

        System.out.println("Your list contains the following words with " + length + " letters: ");
        for (String item : list) {

            if (item.length() == length) {
                System.out.println(item);
            }
        }
    }
}
