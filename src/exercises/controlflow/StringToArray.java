package exercises.controlflow;

/*
public class StringToArray {
    public static void main(String[] args) {
        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] array = words.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
*/

// splitting into sentences rather than words:
public class StringToArray {
    public static void main(String[] args) {
        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] array = words.split("\\. ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}