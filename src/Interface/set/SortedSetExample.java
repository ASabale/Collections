package Interface.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // Creating a SortedSet of student scores
        SortedSet<Integer> studentScores = new TreeSet<>();

        // Adding student scores (add)
        studentScores.add(85);
        studentScores.add(92);
        studentScores.add(75);
        studentScores.add(88);
        studentScores.add(90);
        System.out.println("Sorted set of student scores: " + studentScores);

        // Trying to add a duplicate score (won't add as sets don't allow duplicates)
        studentScores.add(85);
        System.out.println("After attempting to add duplicate score 85: " + studentScores);

        // Checking the first (lowest) element (first)
        System.out.println("Lowest score: " + studentScores.first());

        // Checking the last (highest) element (last)
        System.out.println("Highest score: " + studentScores.last());

        // Getting a subset of scores that are less than 90 (headSet)
        SortedSet<Integer> scoresBelow90 = studentScores.headSet(90);
        System.out.println("Scores below 90: " + scoresBelow90);

        // Getting a subset of scores that are greater than or equal to 88 (tailSet)
        SortedSet<Integer> scoresAboveOrEqual88 = studentScores.tailSet(88);
        System.out.println("Scores 88 and above: " + scoresAboveOrEqual88);

        // Getting a subset of scores between 80 (inclusive) and 90 (exclusive) (subSet)
        SortedSet<Integer> scoresBetween80And90 = studentScores.subSet(80, 90);
        System.out.println("Scores between 80 (inclusive) and 90 (exclusive): " + scoresBetween80And90);

        // Removing a score (remove)
        studentScores.remove(75);
        System.out.println("After removing score 75: " + studentScores);

        // Checking if the set contains a particular score (contains)
        System.out.println("Contains score 92? " + studentScores.contains(92));

        // Checking the size of the set (size)
        System.out.println("Number of scores: " + studentScores.size());

        // Iterating over the set (for-each loop)
        System.out.println("Iterating over the sorted set of student scores:");
        for (Integer score : studentScores) {
            System.out.println(score);
        }

        // Clearing the set (clear)
        studentScores.clear();
        System.out.println("Set after clearing all scores: " + studentScores);

        // Checking if the set is empty (isEmpty)
        System.out.println("Is the set empty? " + studentScores.isEmpty());
    }
}
