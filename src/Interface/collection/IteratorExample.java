package Interface.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating a List of shopping cart items
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Apple");
        shoppingCart.add("Banana");
        shoppingCart.add("Carrot");
        shoppingCart.add("Date");
        shoppingCart.add("Eggplant");
        System.out.println("Initial shopping cart: " + shoppingCart);

        // Creating an Iterator for the List
        Iterator<String> iterator = shoppingCart.iterator();

        // Iterating through the List using the Iterator
        System.out.println("Iterating through the shopping cart:");
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }

        // Removing an item from the List while iterating (use iterator's remove method)
        iterator = shoppingCart.iterator(); // Recreate iterator since the previous one is exhausted
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("Date")) {
                iterator.remove(); // Remove 'Date' from the list
            }
        }
        System.out.println("Shopping cart after removing 'Date': " + shoppingCart);

        // Using Iterator to modify elements (example of "for-each" style modification)
        for (Iterator<String> it = shoppingCart.iterator(); it.hasNext(); ) {
            String item = it.next();
            // Convert item to uppercase (as an example modification)
            System.out.println("Modifying item: " + item.toUpperCase());
        }

        // Checking if the Iterator has more elements (hasNext)
        iterator = shoppingCart.iterator(); // Recreate iterator
        if (iterator.hasNext()) {
            System.out.println("Iterator has more elements.");
        } else {
            System.out.println("Iterator has no more elements.");
        }
    }
}
