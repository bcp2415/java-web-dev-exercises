package exercises.controlflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class SplitStringToArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] firstStage = seuss.split("\\s+");


        /*
        // first way: create an ArrayList, then use add method while we loop through the array
        ArrayList<String> splits = new ArrayList<String>();
        for (int i = 0; i < firstStage.length; i++) {
            splits.add(firstStage[i]);
        }
        */

        // second way: use List class to create ArrayList, then invoke asList() method to create ArrayList
        ArrayList<String> splits = new ArrayList<String>(Arrays.asList(firstStage));

        int length;
        System.out.println("Enter the length of the words you want to find in the list: ");
        length = input.nextInt();
        input.close();

        System.out.println("The poem contains the following words with " + length + " letters: ");
        for (String item : splits) {

            if (item.length() == length) {
                System.out.println(item);
            }
        }
    }
}
