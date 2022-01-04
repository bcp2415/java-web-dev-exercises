package exercises.controlflow.hashmappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter the students, or press ENTER to finish: ");

        do {
            System.out.println("Enter the student's name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Enter the ID number: ");
                int newId = input.nextInt();
                students.put(newId, newStudent);

                // read in next input before checking whether to continue the loop
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        // print class roster
        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Id: " + student.getKey() + "; Name: " + student.getValue());
        }
    }
}
