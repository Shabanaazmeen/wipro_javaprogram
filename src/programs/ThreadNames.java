package programs;

public class ThreadNames {
    public static void main(String[] args) {
        // Create two threads using Runnable with empty tasks
        Thread scooby = new Thread(() -> {
            System.out.println("Running thread: " + Thread.currentThread().getName());
        });
        scooby.setName("Scooby");

        Thread shaggy = new Thread(() -> {
            System.out.println("Running thread: " + Thread.currentThread().getName());
        });
        shaggy.setName("Shaggy");

        // Start the threads
        scooby.start();
        shaggy.start();

        // Optionally display thread names in main
        System.out.println("Created Threads:");
        System.out.println(scooby.getName());
        System.out.println(shaggy.getName());
    }
}
