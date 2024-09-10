package implementation.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of favorite movies
        ArrayList<String> favoriteMovies = new ArrayList<>();

        // Adding movies to the ArrayList
        favoriteMovies.add("Inception");
        favoriteMovies.add("The Matrix");
        favoriteMovies.add("Interstellar");
        favoriteMovies.add("The Shawshank Redemption");
        System.out.println("Favorite Movies after adding: " + favoriteMovies);

        // Adding a movie at a specific position
        favoriteMovies.add(2, "The Dark Knight");
        System.out.println("Favorite Movies after adding at index 2: " + favoriteMovies);

        // Retrieving movies by index
        System.out.println("Movie at index 1: " + favoriteMovies.get(1));

        // Removing a movie by index and by object
        favoriteMovies.remove(3); // Removes "The Shawshank Redemption"
        favoriteMovies.remove("The Matrix"); // Removes "The Matrix"
        System.out.println("Favorite Movies after removals: " + favoriteMovies);

        // Checking if the list contains a specific movie
        System.out.println("Contains 'Inception'? " + favoriteMovies.contains("Inception"));
        System.out.println("Contains 'The Matrix'? " + favoriteMovies.contains("The Matrix"));

        // Updating a movie at a specific position
        favoriteMovies.set(1, "The Godfather");
        System.out.println("Favorite Movies after updating index 1: " + favoriteMovies);

        // Getting the size of the ArrayList
        System.out.println("Size of the list: " + favoriteMovies.size());

        // Iterating over the ArrayList
        System.out.println("Iterating over the favorite movies:");
        for (String movie : favoriteMovies) {
            System.out.println("Movie: " + movie);
        }

        // Clearing the ArrayList
        favoriteMovies.clear();
        System.out.println("Favorite Movies after clearing: " + favoriteMovies);

        // Checking if the ArrayList is empty
        System.out.println("Is the favorite movies list empty? " + favoriteMovies.isEmpty());
    }
}
