package java2;

public class ReverseEachWord {

    // Method to reverse each word in a string
    public static String reverseWords(String input) {
        // Split the input string by spaces
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }

        // Remove the trailing space and return
        return result.toString().trim();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        String input = "Hello World from Java";
        String output = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
    }
}
