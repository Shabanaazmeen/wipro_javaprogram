package programs;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter your number: ");
	        int number = scanner.nextInt();
		if(number>0) {
			System.out.println("positive");
			}
		else {
			System.out.println("negative");
		}
		}
	}


