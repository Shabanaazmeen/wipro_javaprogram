package programs;

import java.util.Scanner;

public class Calculator {

    // Static method for integer power
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer base number: ");
        int intBase = scanner.nextInt();

        System.out.print("Enter an integer exponent: ");
        int intExponent = scanner.nextInt();

        // Call powerInt and display result
        int intResult = powerInt(intBase, intExponent);
        System.out.println(intBase + " raised to the power " + intExponent + " is: " + intResult);

        // Taking double input
        System.out.print("Enter a decimal base number: ");
        double doubleBase = scanner.nextDouble();

        System.out.print("Enter an integer exponent for decimal base: ");
        int doubleExponent = scanner.nextInt();

        // Call powerDouble and display result
        double doubleResult = powerDouble(doubleBase, doubleExponent);
        System.out.println(doubleBase + " raised to the power " + doubleExponent + " is: " + doubleResult);

        scanner.close();
    }
}
