package Interface.set;


import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Creating a set of student IDs
        Set<Integer> studentIDs = new HashSet<>();

        // Adding student IDs (add)
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(104);
        System.out.println("Initial set of student IDs: " + studentIDs);

        // Adding a duplicate ID (add - won't add duplicate)
        studentIDs.add(102);
        System.out.println("Set after attempting to add duplicate ID 102: " + studentIDs);

        // Removing a student ID (remove)
        studentIDs.remove(103);
        System.out.println("Set after removing ID 103: " + studentIDs);

        // Checking if a particular student ID exists (contains)
        System.out.println("Contains ID 101? " + studentIDs.contains(101));

        // Checking the size of the set (size)
        System.out.println("Number of student IDs: " + studentIDs.size());

        // Iterating through the set (for-each loop)
        System.out.println("Iterating over the set of student IDs:");
        for (Integer id : studentIDs) {
            System.out.println(id);
        }

        // Adding all IDs from another set (addAll)
        Set<Integer> newStudentIDs = new HashSet<>();
        newStudentIDs.add(105);
        newStudentIDs.add(106);
        studentIDs.addAll(newStudentIDs);
        System.out.println("Set after adding new student IDs: " + studentIDs);

        // Checking if the set contains all elements from another set (containsAll)
        System.out.println("Contains all newStudentIDs? " + studentIDs.containsAll(newStudentIDs));

        // Removing all IDs from another set (removeAll)
        studentIDs.removeAll(newStudentIDs);
        System.out.println("Set after removing new student IDs: " + studentIDs);

        // Retaining only common IDs between sets (retainAll)
        Set<Integer> graduatedStudentIDs = new HashSet<>();
        graduatedStudentIDs.add(101);
        graduatedStudentIDs.add(102);
        studentIDs.retainAll(graduatedStudentIDs);
        System.out.println("Set after retaining only graduated student IDs: " + studentIDs);

        // Clearing the set (clear)
        studentIDs.clear();
        System.out.println("Set after clearing all student IDs: " + studentIDs);

        // Checking if the set is empty (isEmpty)
        System.out.println("Is the set empty? " + studentIDs.isEmpty());
    }
}

