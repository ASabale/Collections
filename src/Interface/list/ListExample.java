package Interface.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating a list of tasks
        List<String> toDoList = new ArrayList<>();

        // Adding tasks (add)
        toDoList.add("Buy groceries");
        toDoList.add("Clean the house");
        toDoList.add("Pay bills");
        System.out.println("Initial To-Do List: " + toDoList);

        // Inserting a task at a specific position (add with index)
        toDoList.add(1, "Pick up laundry");
        System.out.println("To-Do List after inserting a task at index 1: " + toDoList);

        // Getting a task by its index (get)
        String task = toDoList.get(2);
        System.out.println("Task at index 2: " + task);

        // Updating a task (set)
        toDoList.set(0, "Buy groceries and snacks");
        System.out.println("To-Do List after updating the first task: " + toDoList);

        // Removing a task by its index (remove with index)
        toDoList.remove(3);
        System.out.println("To-Do List after removing the task at index 3: " + toDoList);

        // Finding the index of a task (indexOf, lastIndexOf)
        int index = toDoList.indexOf("Pick up laundry");
        System.out.println("Index of 'Pick up laundry': " + index);

        // Adding multiple tasks at once (addAll)
        List<String> additionalTasks = new ArrayList<>();
        additionalTasks.add("Water the plants");
        additionalTasks.add("Read a book");
        toDoList.addAll(additionalTasks);
        System.out.println("To-Do List after adding more tasks: " + toDoList);

        // Iterating through the list using a loop (for-each)
        System.out.println("Iterating through the to-do list:");
        for (String t : toDoList) {
            System.out.println(t);
        }

        // Creating a sublist (subList)
        List<String> subList = toDoList.subList(1, 3);
        System.out.println("Sublist (from index 1 to 3): " + subList);

        // Checking if the list contains a specific task (contains)
        boolean containsTask = toDoList.contains("Read a book");
        System.out.println("Contains 'Read a book'? " + containsTask);

        // Removing all tasks from the list (clear)
        toDoList.clear();
        System.out.println("To-Do List after clearing all tasks: " + toDoList);

        // Checking if the list is empty (isEmpty)
        System.out.println("Is the list empty? " + toDoList.isEmpty());
    }
}
