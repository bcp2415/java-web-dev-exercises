package exercises.controlflow;

import java.util.ArrayList;

public class ArrayListPracticeClass2 {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();

        test.add(2);
        test.add(5);
        test.add(17);
        test.add(147);
        test.add(54);
        test.add(10012);
        test.add(72);
        test.add(8);
        test.add(91);
        test.add(100);
        test.add(0);
        test.add(42);
        test.add(13);
        test.add(3);

        System.out.println(findSumEvens(test));
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
