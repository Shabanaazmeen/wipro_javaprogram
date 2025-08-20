package java2;

public class ArraySorter {

    // Method to sort the array in ascending order
    public static void sortArray(int[] arr) {
        int n = arr.length;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            // Flag to check if any swap happens in this pass
            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Original array:");
        printArray(arr);

        sortArray(arr);

        System.out.println("Sorted array in ascending order:");
        printArray(arr);
    }
}
