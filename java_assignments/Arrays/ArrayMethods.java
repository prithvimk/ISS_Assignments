package Arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        
        // Printing the array
        System.out.println("Array: " + Arrays.toString(numbers));
        
        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Searching for an element in the array
        int searchValue = 9;
        int index = Arrays.binarySearch(numbers, searchValue);
        if (index >= 0) {
            System.out.println(searchValue + " found at index " + index);
        } else {
            System.out.println(searchValue + " not found in the array");
        }
        
        // Filling the array with a specific value
        int[] filledArray = new int[5];
        int fillValue = 10;
        Arrays.fill(filledArray, fillValue);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
        
        // Comparing arrays element-wise
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 5, 6};
        
        System.out.println("array1 and array2 are equal: " + Arrays.equals(array1, array2));        
        System.out.println("array1 and array3 are equal: " + Arrays.equals(array1, array3));
    }
}

