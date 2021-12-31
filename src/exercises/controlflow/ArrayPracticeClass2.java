package exercises.controlflow;

/*
public class ArrayPracticeClass2 {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < someInts.length; i++) {
            System.out.println(someInts[i]);
        }
    }
}
*/

/*
public class ArrayPracticeClass2 {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        // print only odd-numbered indices:
        for (int i = 1; i < someInts.length; i+=2) {
            System.out.println(someInts[i]);
        }
    }
}
 */

public class ArrayPracticeClass2 {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        // print only odd values:
        for (int i = 0; i < someInts.length; i++) {
            if (someInts[i] % 2 != 0)
            System.out.println(someInts[i]);
        }
    }
}