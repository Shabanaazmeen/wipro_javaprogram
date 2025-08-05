package programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit=100;
		int first=0;
		int second=1;
		for(int i=1;i<=limit-1;i++) {
			  System.out.print(first + " ");
			int result=first+second;
			
			first=second;
			second=result;
			
		}
		// TODO Auto-generated method stub

	}

}
