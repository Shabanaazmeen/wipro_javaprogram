package programs;
class claculator{
	public int add(int n1,int n2) {
		int r=n1+n2;
		return r;
	}
	
	
}
public class Object {
	public static void main(String[] args) {
		int a=5;
		int b=6;
		claculator cal=new claculator();
		 int result =cal.add(a,b);
		System.out.println(result);
		
	}

}
