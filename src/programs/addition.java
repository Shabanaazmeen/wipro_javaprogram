package programs;
import java.util.Scanner;
public class addition {
	public static void main(String[]args) {
		Scanner num =new Scanner(System.in);
		System.out.println("enter the first number");
		int a=num.nextInt();
		System.out.println("enter the second number");
		int b=num.nextInt();
	
	
        while (b != 0) {
		int carry = a & b;      // Step 1: Find carry
		    a = a ^ b;          // Step 2: Add without carry
		    b = carry << 1;     // Step 3: Move carry to correct bit
		  }

	System.out.println("Sum = " + a);  // Final result
		    }
		}
