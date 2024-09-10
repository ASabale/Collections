package Interface.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a collection of books
        Collection<String> books = new ArrayList<>();

        // Adding books (add, addAll)
        books.add("The Catcher in the Rye");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        System.out.println("Books collection after adding: " + books);

        // Checking the size of the collection (size)
        System.out.println("Number of books: " + books.size());

        // Checking if a particular book is in the collection (contains)
        System.out.println("Contains '1984': " + books.contains("1984"));

        // Removing a book from the collection (remove)
        books.remove("The Catcher in the Rye");
        System.out.println("Books collection after removing one book: " + books);

        // Adding more books (addAll)
        Collection<String> moreBooks = new ArrayList<>();
        moreBooks.add("Pride and Prejudice");
        moreBooks.add("The Great Gatsby");
        books.addAll(moreBooks);
        System.out.println("Books collection after adding more books: " + books);

        // Checking if the collection is empty (isEmpty)
        System.out.println("Is the collection empty? " + books.isEmpty());

        // Iterating over the collection (iterator)
        Iterator<String> iterator = books.iterator();
        System.out.println("Iterating over the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if the collection contains all elements of another collection (containsAll)
        System.out.println("Contains all moreBooks? " + books.containsAll(moreBooks));

        // Removing all elements from another collection (removeAll)
        books.removeAll(moreBooks);
        System.out.println("Books collection after removing moreBooks: " + books);

        // Retaining only the elements that are in another collection (retainAll)
        Collection<String> classicBooks = new ArrayList<>();
        classicBooks.add("1984");
        classicBooks.add("To Kill a Mockingbird");
        books.retainAll(classicBooks);
        System.out.println("Books collection after retaining only classicBooks: " + books);

        // Clearing the collection (clear)
        books.clear();
        System.out.println("Books collection after clearing: " + books);

        // Final check if empty
        System.out.println("Is the collection empty? " + books.isEmpty());
    }
}
