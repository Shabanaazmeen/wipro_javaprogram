package java2;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        System.out.println("Majority element: " + findMajority(nums));
    }

    public static int findMajority(int[] nums) {
        int count = 0, candidate = 0;

        // Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Optional: verify if it's truly a majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }

        return (count > nums.length / 2) ? candidate : -1; // -1 if no majority
    }
}
