package programs;

public class Swapusingtemp {
	public static void main(String[]args) {
	int a=12;
	int b=13;
	int temp=a;
	a=b;
	b=temp;
	System.out.println("after swaping:a= "+a+",b ="+b);
	int c =a+b;
	int d=c-b;
	c=c-d;
	System.out.println("After swaping:c= "+c+",d ="+d);
	}	

}