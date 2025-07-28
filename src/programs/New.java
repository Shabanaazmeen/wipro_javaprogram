package programs;

import java.util.Scanner;
public class New {
public static void main(String[] args) {

	Scanner num=new Scanner(System.in);
	System.out.println("enter the value a");
	int a=num.nextInt();
	System.out.println("enter the number 2");
	int b=num.nextInt();
	System.out.println("addition" +(a+b));
	System.out.println("subtraction" +(a-b));
	System.out.println("multiplication"+(a*b));
	System.out.println("division" +(a/b));
	System.out.println("modulus" +(a%b));
}
}