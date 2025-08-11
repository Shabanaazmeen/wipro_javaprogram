package programs;
import java.util.Scanner;

public class JumbleWords {

    // Main function
    public static String JumbledWords(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (input2 == 1) {
                result.append(method1(word));
            } else if (input2 == 2) {
                result.append(method2(word));
            } else {
                return "Invalid method type.";
            }
            result.append(" ");
        }

        return result.toString().trim(); // Remove trailing space
    }

    // Method 1: Forward odd-positioned + Backward even-positioned
    private static String method1(String word) {
        StringBuilder forward = new StringBuilder();
        StringBuilder backward = new StringBuilder();

        // Forward: pick characters at 0,2,4,...
        for (int i = 0; i < word.length(); i += 2) {
            forward.append(word.charAt(i));
        }

        // Backward: pick characters at even indices from end
        for (int i = word.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                backward.append(word.charAt(i));
            }
        }

        return forward.toString() + backward.toString();
    }

    // Method 2: Forward odd-positioned + Forward even-positioned
    private static String method2(String word) {
        StringBuilder odd = new StringBuilder();  // index 0,2,4...
        StringBuilder even = new StringBuilder(); // index 1,3,5...

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                odd.append(word.charAt(i));
            } else {
                even.append(word.charAt(i));
            }
        }

        return odd.toString() + even.toString();
    }

    // Main method: Entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get sentence input
        System.out.print("Enter the sentence to jumble: ");
        String input1 = scanner.nextLine();

        // Get method input
        System.out.print("Enter the method number (1 or 2): ");
        int input2 = scanner.nextInt();

        // Output the jumbled sentence
        String output = JumbledWords(input1, input2);
        System.out.println("Jumbled Sentence: " + output);

        scanner.close();
    }
}

