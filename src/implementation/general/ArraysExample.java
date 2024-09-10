package implementation.general;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = {5, 3, 8, 1, 2};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Binary search for a specific element
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of element 8: " + index);

        // Checking if two arrays are equal
        int[] numbers2 = {1, 2, 3, 5, 8};
        boolean isEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Arrays are equal: " + isEqual);

        // Copying an array
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copyOfNumbers));

        // Copying a range of elements from the original array
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Range copy (index 1 to 3): " + Arrays.toString(rangeCopy));

        // Filling an array with a specific value
        Arrays.fill(numbers, 10);
        System.out.println("Array filled with 10: " + Arrays.toString(numbers));

        // Converting an array to a list
        String[] stringArray = {"one", "two", "three"};
        var list = Arrays.asList(stringArray);
        System.out.println("Array to list: " + list);

        // Creating and printing a multidimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Multidimensional array:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

