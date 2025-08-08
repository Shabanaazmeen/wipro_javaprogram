package programs;
public class NumberPrinterThread {
    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                
                // After printing 5, sleep for 5000 milliseconds (5 seconds)
                if (i == 5) {
                    try {
                        Thread.sleep(5000); // 5000 milliseconds = 5 seconds
                    } catch (InterruptedException e) {
                        System.out.println("Thread was interrupted during sleep.");
                    }
                }
            }
        });

        // Start the thread
        thread.start();
    }
}