package Interface.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a Map of contacts
        Map<String, String> contactDirectory = new HashMap<>();

        // Adding contacts (put)
        contactDirectory.put("Alice", "123-456-7890");
        contactDirectory.put("Bob", "987-654-3210");
        contactDirectory.put("Charlie", "555-123-4567");
        System.out.println("Contact Directory after adding contacts: " + contactDirectory);

        // Getting a contact's phone number (get)
        System.out.println("Bob's phone number: " + contactDirectory.get("Bob"));

        // Checking if a contact exists (containsKey)
        System.out.println("Contains contact 'Alice'? " + contactDirectory.containsKey("Alice"));

        // Checking if a phone number exists (containsValue)
        System.out.println("Contains phone number '555-123-4567'? " + contactDirectory.containsValue("555-123-4567"));

        // Removing a contact (remove)
        contactDirectory.remove("Charlie");
        System.out.println("Contact Directory after removing Charlie: " + contactDirectory);

        // Getting all contact names (keySet)
        System.out.println("Contact names: " + contactDirectory.keySet());

        // Getting all phone numbers (values)
        System.out.println("Phone numbers: " + contactDirectory.values());

        // Getting all entries (entrySet)
        System.out.println("All entries (contact and phone number): " + contactDirectory.entrySet());

        // Iterating over entries (for-each loop)
        System.out.println("Iterating over contact directory:");
        for (Map.Entry<String, String> entry : contactDirectory.entrySet()) {
            System.out.println("Contact: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }

        // Checking the size of the map (size)
        System.out.println("Number of contacts: " + contactDirectory.size());

        // Clearing the map (clear)
        contactDirectory.clear();
        System.out.println("Contact Directory after clearing: " + contactDirectory);

        // Checking if the map is empty (isEmpty)
        System.out.println("Is the contact directory empty? " + contactDirectory.isEmpty());
    }
}
