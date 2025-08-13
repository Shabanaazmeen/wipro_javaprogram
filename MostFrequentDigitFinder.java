package wipro;


public class MostFrequentDigitFinder {

    public int MostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] digitFrequency = new int[10];

        // Count digit frequencies from each number
        for (int i = 0; i < input2; i++) {
            int number = input1[i];

            if (number == 0) {
                digitFrequency[0]++;
                continue;
            }

            while (number > 0) {
                int digit = number % 10;
                digitFrequency[digit]++;
                number /= 10;
            }
        }

        // Determine most frequent digit (tie-breaker: higher digit wins)
        int maxFrequency = -1;
        int mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] >= maxFrequency) {
                maxFrequency = digitFrequency[i];
                mostFrequentDigit = i;
            }
        }

        return mostFrequentDigit;
    }

    public static void main(String[] args) {
        MostFrequentDigitFinder finder = new MostFrequentDigitFinder();
        int[] input = {25, 2, 3, 57, 38, 123};
        int result = finder.MostFrequentlyOccurringDigit(input, input.length);
        System.out.println("Most frequently occurring digit: " + result);
    }
}

