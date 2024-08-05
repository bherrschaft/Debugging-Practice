public class AverageCalculator {

    /**
     * This method calculates the average of an array of integers.
     *
     * @param numbers An array of integers.
     * @return The average of the integers as a double.
     */
    public static double calculateAverage(int[] numbers) {
        // Check if the array is null or empty
        if (numbers == null || numbers.length == 0) {
            // Throw an exception if the array is null or empty to avoid errors
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0; // Initialize sum of elements
        for (int number : numbers) { // Iterate through each number in the array
            sum += number; // Add each number to sum
        }
        return (double) sum / numbers.length; // Calculate average as double
    }

    public static void main(String[] args) {
        // Problem 1: Null Pointer Exception
        // Initial Code: int[] numbers = null;
        // This caused a NullPointerException when calling calculateAverage(numbers).
        // Solution: Initialize the array with actual values.
        int[] numbers = {1, 2, 3, 4, 5};

        // Problem 2: Array Index Out of Bounds Exception
        // Initial Code: System.out.println("Accessing index out of bounds: " + numbers[5]);
        // This caused an ArrayIndexOutOfBoundsException because index 5 does not exist.
        // Solution: Ensure indices used are within bounds.
        // int lastElement = numbers[numbers.length - 1]; // Correctly accessing the last element
        // System.out.println("Last element: " + lastElement);

        // Problem 3: Logic Error
        // Initial Code: return sum / (numbers.length - 1);
        // This caused an incorrect average calculation because it divided by (length - 1).
        // Solution: Correct the division to sum / numbers.length.
        double average = calculateAverage(numbers); // Call method to calculate average
        System.out.println("Average: " + average); // Print the result
    }
}
