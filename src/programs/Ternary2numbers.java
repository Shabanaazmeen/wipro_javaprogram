package programs;

public class Ternary2numbers {
	public static void main(String[]args) {
		int a=4;
		int b=12;
		int c=14;
		int result=a>b?a:b;
		System.out.println(result);
		int result1=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(result1);
		
		
}
}