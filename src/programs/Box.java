package programs;
import java.util.Scanner;

public class Box {
    // Instance variables
    private double width;
    private double height;
    private double depth;

    // Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    // Main method — only one!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the box: ");
        double height = scanner.nextDouble();

        System.out.print("Enter depth of the box: ");
        double depth = scanner.nextDouble();

        // Creating Box object
        Box userBox = new Box(width, height, depth);

        // Printing the volume
        System.out.println("Volume of the box: " + userBox.getVolume());

        scanner.close(); // Always close the scanner
    }
}
