package programs;
import java.io.File;
public class ClassExercise3 {

	public static void main(String[] args) {
		 File my_file_dir = new File("C:\\Users\\shaik\\OneDrive\\Desktop\\javapractice");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }
  }
		// TODO Auto-generated method stub

