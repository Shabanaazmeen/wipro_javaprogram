package programs;

public class multiplication {
	public static void main(String[]args) {
		int  a = 6;
        int shift = 2; // This means: a * 2^2 = a * 4

        int result = a << shift;

        System.out.println(a + " multiplied by 2^" + shift + " = " + result);
	}

}
