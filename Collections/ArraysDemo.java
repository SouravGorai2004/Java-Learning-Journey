import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        // 1. Arrays.toString()
        int[] numbers = {5, 2, 8, 1, 3};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Arrays.sort()
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3. Arrays.binarySearch()
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of element 3: " + index);

        // 4. Arrays.equals()
        int[] numbersCopy = {1, 2, 3, 5, 8};
        boolean isEqual = Arrays.equals(numbers, numbersCopy);
        System.out.println("Arrays Equal? " + isEqual);

        // 5. Arrays.fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 9);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // 6. Arrays.asList()
        String[] fruits = {"Apple", "Banana", "Mango"};
        List<String> fruitList = Arrays.asList(fruits);
        System.out.println("Array converted to List: " + fruitList);
    }
}
