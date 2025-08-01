package programs;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		Scanner nums=new Scanner(System.in);
		System.out.println("enter the number");
	    int num=nums.nextInt();
		int result=0;
		boolean add=true;
		for(int i=num;i>=1;i--) {
			if(add) {
				result+=i;
		}
			else {
				result-=i;
				
			}
		}
		System.out.println(result);
		
		// TODO Auto-generated method stub

	}

}
