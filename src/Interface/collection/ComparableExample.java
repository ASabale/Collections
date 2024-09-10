package Interface.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define the Person class that implements Comparable
class Human implements Comparable<Human> {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement the compareTo method to define the natural ordering
    @Override
    public int compareTo(Human other) {
        // Compare persons by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Human> people = new ArrayList<>();
        people.add(new Human("Alice", 30));
        people.add(new Human("Bob", 25));
        people.add(new Human("Charlie", 35));
        people.add(new Human("Diana", 28));

        System.out.println("Original list: " + people);

        // Sort the list using the natural ordering defined by compareTo
        Collections.sort(people);
        System.out.println("Sorted list by age: " + people);

        // Demonstrate using compareTo directly
        Human human1 = new Human("Eve", 22);
        Human human2 = new Human("Frank", 30);
        int comparisonResult = human1.compareTo(human2);
        if (comparisonResult < 0) {
            System.out.println(human1.getName() + " is younger than " + human2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(human1.getName() + " is older than " + human2.getName());
        } else {
            System.out.println(human1.getName() + " and " + human2.getName() + " are of the same age");
        }
    }
}
