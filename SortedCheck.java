package java2;

public class SortedCheck {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 4, 5};

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Is array sorted? " + isSorted);
    }
}
