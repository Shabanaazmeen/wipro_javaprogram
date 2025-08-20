package java2;

public class MissingNumberFinder {

    // Method to find the missing number
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference
        return expectedSum - actualSum;
    }

    // Main method to test the program
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Missing number is 5
        int n = 8; // We expect numbers from 1 to 8

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
