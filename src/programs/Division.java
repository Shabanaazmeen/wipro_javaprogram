package programs;

public class Division {

	public static void main(String[] args) {
		int a = 40;
        int shift = 3; // This means: a / 2^3 = a / 8

        int result = a >> shift;

        System.out.println(a + " divided by 2^" + shift + " = " + result);
    }
}	

