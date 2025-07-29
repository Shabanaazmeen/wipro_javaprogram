package programs;
import java.util.Arrays;
public class Arrays {

	public static void main(String[] args) {
	int [] array=new int[5];//decleration and memory location basic three ways
	array[0]=12;//
	array[1]=34;
	array[2]=3;
	array[3]=4;
    array[4]=5;
	System.out.println(array[4]);
		//initilization and decleration and memory allocation
	     int [] result= {1,2,3,4};
	     System.out.println(Arrays.toString(result));
		int [] marks = {77,67,78,88,98};
		for (int i=0;i<marks.length;i++) {
		 System.out.println(marks[i]);
		}
	    for (int i=marks.length-1;i>=0;i--) {
				 System.out.println(marks[i]);	 
		}
	    for (int elements:marks) {
	    	System.out.println(elements);
	    }
		String[] names= {"sha","gfty","ersf","hrue"};
		System.out.println(names.length);
		
		
		
		// TODO Auto-generated method stub

	}

}
