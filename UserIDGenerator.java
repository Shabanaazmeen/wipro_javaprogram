package wipro;
import java.util.Scanner;

public class UserIDGenerator {

    public static String generateUserID(String firstName, String lastName, String pin, int N) {
        String smallerName, longerName;

        // Step 1: Determine smaller and longer name
        if (firstName.length() < lastName.length()) {
            smallerName = firstName;
            longerName = lastName;
        } else if (firstName.length() > lastName.length()) {
            smallerName = lastName;
            longerName = firstName;
        } else {
            // Same length → alphabetical comparison
            if (firstName.compareToIgnoreCase(lastName) < 0) {
                smallerName = firstName;
                longerName = lastName;
            } else {
                smallerName = lastName;
                longerName = firstName;
            }
        }

        // Step 2: Extract required characters
        char lastCharSmaller = smallerName.charAt(smallerName.length() - 1);
        char digitFromLeft = pin.charAt(N - 1);
        char digitFromRight = pin.charAt(pin.length() - N);

        String rawUserID = "" + lastCharSmaller + longerName + digitFromLeft + digitFromRight;

        // Step 3: Toggle case
        StringBuilder toggledUserID = new StringBuilder();
        for (char ch : rawUserID.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledUserID.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledUserID.append(Character.toUpperCase(ch));
            } else {
                toggledUserID.append(ch); // For digits
            }
        }

        return toggledUserID.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interactive Inputs
        System.out.print("👤 Enter First Name: ");
        String firstName = scanner.next();

        System.out.print("👤 Enter Last Name: ");
        String lastName = scanner.next();

        System.out.print("🔢 Enter PIN (only digits): ");
        String pin = scanner.next();

        System.out.print("📍 Enter position N (starting from 1): ");
        int N = scanner.nextInt();

        // Validation
        if (N <= 0 || N > pin.length()) {
            System.out.println("❌ Invalid N: It should be between 1 and " + pin.length());
        } else {
            String userID = generateUserID(firstName, lastName, pin, N);
            System.out.println("✅ Generated User ID: " + userID);
        }

        scanner.close();
    }
}
