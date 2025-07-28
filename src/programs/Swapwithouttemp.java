package programs;

public class Swapwithouttemp {
	public static void main(String[]args) {
	int a=11;
	int b=14;
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After swaping:a= "+a+",b ="+b);
	
	}

}

