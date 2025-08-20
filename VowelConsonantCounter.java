package java2;
public class VowelConsonantCounter {

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;

        // Convert input to lowercase to simplify comparison
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    // Main method to run the program
    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println("Input: " + input);
        countVowelsAndConsonants(input);
    }
}
