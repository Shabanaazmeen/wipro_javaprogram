package programs;
import java.util.Random;

public class ColourDisplay implements Runnable {

    
    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

    @Override
    public void run() {
        Random rand = new Random();

        while (true) {
            int index = rand.nextInt(colours.length);  // Generate random index
            String colour = colours[index];

            System.out.println("Colour: " + colour);

            // Stop if colour is red
            if (colour.equals("red")) {
                System.out.println("Red found! Stopping thread.");
                break;
            }

            // Optional: delay for visibility
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Create object of ColourDisplay
        ColourDisplay cd = new ColourDisplay();

        // Create a thread and start it
        Thread thread = new Thread(cd);
        thread.start();
    }
}

