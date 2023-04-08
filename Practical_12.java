import java.util.Arrays;
public class Practical_12 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4}; // The list of numbers to be sorted
        int temp; // A temporary variable used for swapping values
        boolean swapped; // A boolean variable used to indicate if any swaps were made in the current iteration
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));
        // Bubble sort algorithm
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    // Swap the values at index j and j+1
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }
            }
            // If no swaps were made in the current iteration, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}