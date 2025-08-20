package java2;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String input) {
        // LinkedHashSet preserves insertion order and removes duplicates
        Set<Character> seen = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            seen.add(ch);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char ch : seen) {
            result.append(ch);
        }

        return result.toString();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + output);
    }
}

