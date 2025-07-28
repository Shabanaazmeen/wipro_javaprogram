package programs;

public class addition {
	public static void main(String[]args) {
		int a = 11;
		int b = 14;
        while (b != 0) {
		int carry = a & b;      // Step 1: Find carry
		    a = a ^ b;          // Step 2: Add without carry
		    b = carry << 1;     // Step 3: Move carry to correct bit
		  }

	System.out.println("Sum = " + a);  // Final result
		    }
		}


