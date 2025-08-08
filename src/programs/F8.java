package programs;
import java.util.Scanner;
public class F8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a=0;
		int b=1;
	    for(int i=0;i<=n;i++) {
	    	System.out.print(a+" "); 
	    	int result=a+b;
	    	a=b;
	    	b=result;
	    		
	    }
		
		// TODO Auto-generated method stub

	}

}
