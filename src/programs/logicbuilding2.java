package programs;

public class logicbuilding2 {
     public static int seriesN(int a, int b, int c, int N) {
        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;

        int gap1 = b - a;
        int gap2 = c - b;

        int current = c;
        int nextValue = 0;

        // Generate elements from 4 to N
        for (int i = 4; i <= N; i++) {
            if ((i - 4) % 2 == 0) {
                nextValue = current + gap1;
            } else {
                nextValue = current + gap2;
            }
            current = nextValue;
        }

        return current;
    }

    // For testing
    public static void main(String[] args) {
        int result = seriesN(1, 3, 6, 100);
        System.out.println("100th element: " + result); // Expected Output: 248

        // Another test case
        int result2 = seriesN(5, -2, -4, 14);
        System.out.println("14th element: " + result2); // Expected Output: -56
    }
}