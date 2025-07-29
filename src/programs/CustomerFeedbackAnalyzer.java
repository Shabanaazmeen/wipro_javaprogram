import java.util.*;
import java.util.regex.*;

public class CustomerFeedbackAnalyzer {

    static List<String> feedbackList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addFeedback(scanner);
                    break;
                case 2:
                    viewAllFeedback();
                    break;
                case 3:
                    cleanFeedback();
                    break;
                case 4:
                    maskSensitiveInfo();
                    break;
                case 5:
                    keywordSearch(scanner);
                    break;
                case 6:
                    showSummaryReport();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }

    static void showMenu() {
        System.out.println("\nCustomer Feedback Analyzer Menu:");
        System.out.println("1. Add Feedback");
        System.out.println("2. View All Feedback");
        System.out.println("3. Clean Feedback");
        System.out.println("4. Mask Emails and Phone Numbers");
        System.out.println("5. Keyword Occurrence Count");
        System.out.println("6. Feedback Summary Report");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    static void addFeedback(Scanner scanner) {
        System.out.println("Enter feedback:");
        String feedback = scanner.nextLine();
        feedbackList.add(feedback);
        System.out.println("Feedback added successfully.");
    }

    static void viewAllFeedback() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
        } else {
            for (int i = 0; i < feedbackList.size(); i++) {
                System.out.println((i + 1) + ". " + feedbackList.get(i));
            }
        }
    }

    static void cleanFeedback() {
        for (int i = 0; i < feedbackList.size(); i++) {
            String cleaned = feedbackList.get(i)
                    .trim()
                    .replaceAll("[^a-zA-Z0-9@.\\s]", "") // remove most special chars
                    .replaceAll("\\s+", " ");
            feedbackList.set(i, cleaned);
        }
        System.out.println("All feedback cleaned.");
    }

    static void maskSensitiveInfo() {
        Pattern emailPattern = Pattern.compile("[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,6}");
        Pattern phonePattern = Pattern.compile("\\b(\\+91[-\\s]?)?[0-9]{10}\\b");

        for (int i = 0; i < feedbackList.size(); i++) {
            String feedback = feedbackList.get(i);
            feedback = emailPattern.matcher(feedback).replaceAll("[EMAIL]");
            feedback = phonePattern.matcher(feedback).replaceAll("[PHONE]");
            feedbackList.set(i, feedback);
        }
        System.out.println("Sensitive information masked.");
    }

    static void keywordSearch(Scanner scanner) {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();
        int count = 0;

        for (String feedback : feedbackList) {
            String[] words = feedback.toLowerCase().split("\\W+");
            for (String word : words) {
                if (word.equals(keyword)) {
                    count++;
                }
            }
        }

        System.out.println("Keyword \"" + keyword + "\" found " + count + " time(s).");
    }

    static void showSummaryReport() {
        int total = feedbackList.size();
        int sum = 0, max = 0, min = Integer.MAX_VALUE;

        for (String feedback : feedbackList) {
            int wordCount = feedback.trim().isEmpty() ? 0 : feedback.trim().split("\\s+").length;
            sum += wordCount;
            max = Math.max(max, wordCount);
            min = Math.min(min, wordCount);
        }

        double avg = total == 0 ? 0 : (double) sum / total;
        if (total == 0) min = 0;

        System.out.printf("Total Feedbacks: %d\nAverage Length: %.2f words\nMax: %d words\nMin: %d words\n",
                total, avg, max, min);
    }
}
