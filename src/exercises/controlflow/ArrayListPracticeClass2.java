package exercises.controlflow;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeClass2 {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(2, 5, 17, 147, 54, 10012, 72, 8, 91, 100, 0, 42, 13, 3));

        System.out.println("The sum of the even numbers in this array is: " + findSumEvens(test));
    }

    public static int findSumEvens(ArrayList<Integer> input) {
        int sum = 0;
        for (int member : input) {
            if (member % 2 == 0) {
                sum += member;
            }
        }
        return sum;
    }
}
