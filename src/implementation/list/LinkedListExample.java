package implementation.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of tasks
        LinkedList<String> toDoList = new LinkedList<>();

        // Adding tasks to the LinkedList
        toDoList.add("Buy groceries");
        toDoList.add("Call the plumber");
        toDoList.add("Finish homework");
        toDoList.add("Book flight tickets");
        System.out.println("To-Do List after adding tasks: " + toDoList);

        // Adding a task at the beginning and end
        toDoList.addFirst("Water the plants");
        toDoList.addLast("Prepare dinner");
        System.out.println("To-Do List after adding tasks at beginning and end: " + toDoList);

        // Retrieving and removing the first and last task
        System.out.println("First task: " + toDoList.getFirst());
        System.out.println("Last task: " + toDoList.getLast());
        System.out.println("Removing first task: " + toDoList.removeFirst());
        System.out.println("Removing last task: " + toDoList.removeLast());
        System.out.println("To-Do List after removing first and last tasks: " + toDoList);

        // Adding tasks at specific positions
        toDoList.add(1, "Read a book");
        toDoList.add(2, "Go for a walk");
        System.out.println("To-Do List after adding tasks at specific positions: " + toDoList);

        // Removing a task by index
        toDoList.remove(1);
        System.out.println("To-Do List after removing task at index 1: " + toDoList);

        // Checking if the list contains a specific task
        System.out.println("Contains 'Finish homework'? " + toDoList.contains("Finish homework"));

        // Retrieving a task by index
        System.out.println("Task at index 1: " + toDoList.get(1));

        // Iterating over the LinkedList
        System.out.println("Iterating over the to-do list:");
        for (String task : toDoList) {
            System.out.println("Task: " + task);
        }

        // Clearing the list
        toDoList.clear();
        System.out.println("To-Do List after clearing: " + toDoList);

        // Checking if the list is empty
        System.out.println("Is the to-do list empty? " + toDoList.isEmpty());
    }
}
