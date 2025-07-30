package programs;

public class Multidimensionalarray {
	public static void main(String[] args) {
		int arr[][]= new int  [3][4];
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j< arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j< arr.length;j++) {
				arr[i][j]=(int)(Math.random()*100);
				System.out.print(arr+" ");
			}
			System.out.println();
			for (int arry[]:arr) {
				for(int m:arry) {
					System.out.print(m+" ");
				}
				System.out.println();
			}
	}

}
}