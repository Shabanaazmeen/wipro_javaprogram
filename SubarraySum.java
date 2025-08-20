package java2;
public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int start = 0, sum = 0;
        boolean found = false;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start < end) {
                sum -= arr[start++];
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with the given sum found.");
        }
    }
}
