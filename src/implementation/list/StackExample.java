package implementation.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack of books
        Stack<String> bookStack = new Stack<>();

        // Pushing books onto the Stack
        bookStack.push("The Catcher in the Rye");
        bookStack.push("To Kill a Mockingbird");
        bookStack.push("1984");
        bookStack.push("Pride and Prejudice");
        System.out.println("Book Stack after pushing: " + bookStack);

        // Peeking at the top element
        System.out.println("Top book (peek): " + bookStack.peek());

        // Popping elements from the Stack
        System.out.println("Popped book: " + bookStack.pop());
        System.out.println("Popped book: " + bookStack.pop());
        System.out.println("Book Stack after popping: " + bookStack);

        // Checking if the Stack contains a specific book
        System.out.println("Contains '1984'? " + bookStack.contains("1984"));
        System.out.println("Contains 'Pride and Prejudice'? " + bookStack.contains("Pride and Prejudice"));

        // Searching for an element in the Stack
        int position = bookStack.search("To Kill a Mockingbird");
        if (position != -1) {
            System.out.println("'To Kill a Mockingbird' is at position: " + position);
        } else {
            System.out.println("'To Kill a Mockingbird' is not in the stack.");
        }

        // Checking if the Stack is empty
        System.out.println("Is the book stack empty? " + bookStack.isEmpty());

        // Clearing the Stack
        bookStack.clear();
        System.out.println("Book Stack after clearing: " + bookStack);
    }
}
