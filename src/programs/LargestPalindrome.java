package programs;
import java.util.HashMap;

public class LargestPalindrome {

    public static int charactersToRemoveForPalindrome(String input1) {
        input1 = input1.toLowerCase(); // Ignore case

        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : input1.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int oddCount = 0;

        // Count how many characters occur odd number of times
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // Case: all characters different
        if (oddCount == input1.length()) {
            return -1;
        }

        // If 0 or 1 odd characters, it's already a palindrome
        if (oddCount <= 1) {
            return 0;
        }

        // Else, remove (oddCount - 1) characters
        return oddCount - 1;
    }

    public static void main(String[] args) {
        System.out.println(charactersToRemoveForPalindrome("Template")); // Output: 3
        System.out.println(charactersToRemoveForPalindrome("Magma"));    // Output: 0
        System.out.println(charactersToRemoveForPalindrome("Victory"));  // Output: -1
        System.out.println(charactersToRemoveForPalindrome("Level"));    // Output: 0
        System.out.println(charactersToRemoveForPalindrome("MALAYALAM")); // Output: 0
    }
}
