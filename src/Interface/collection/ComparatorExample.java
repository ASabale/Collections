package Interface.collection;

import java.util.Comparator;
import java.util.TreeSet;

// Define a Person class
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a Comparator to sort by age
        Comparator<Human> ageComparator = new Comparator<Human>() {
            @Override
            public int compare(Human p1, Human p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        // Create a TreeSet with the custom Comparator
        TreeSet<Human> peopleByAge = new TreeSet<>(ageComparator);

        // Adding people to the set
        peopleByAge.add(new Human("Alice", 30));
        peopleByAge.add(new Human("Bob", 25));
        peopleByAge.add(new Human("Charlie", 35));
        peopleByAge.add(new Human("Diana", 20));
        System.out.println("People sorted by age: " + peopleByAge);

        // Creating another Comparator to sort by name
        Comparator<Human> nameComparator = new Comparator<Human>() {
            @Override
            public int compare(Human p1, Human p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        // Create a TreeSet with the custom Comparator for names
        TreeSet<Human> peopleByName = new TreeSet<>(nameComparator);

        // Adding people to the set
        peopleByName.add(new Human("Alice", 30));
        peopleByName.add(new Human("Bob", 25));
        peopleByName.add(new Human("Charlie", 35));
        peopleByName.add(new Human("Diana", 20));
        System.out.println("People sorted by name: " + peopleByName);

        // Creating a custom Comparator to sort by age in descending order
        Comparator<Human> ageDescendingComparator = new Comparator<Human>() {
            @Override
            public int compare(Human p1, Human p2) {
                return Integer.compare(p2.getAge(), p1.getAge());
            }
        };

        // Create a TreeSet with the custom Comparator for descending age
        TreeSet<Human> peopleByAgeDescending = new TreeSet<>(ageDescendingComparator);

        // Adding people to the set
        peopleByAgeDescending.add(new Human("Alice", 30));
        peopleByAgeDescending.add(new Human("Bob", 25));
        peopleByAgeDescending.add(new Human("Charlie", 35));
        peopleByAgeDescending.add(new Human("Diana", 20));
        System.out.println("People sorted by age (descending): " + peopleByAgeDescending);
    }
}
