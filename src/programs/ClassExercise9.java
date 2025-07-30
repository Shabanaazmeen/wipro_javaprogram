package programs;
import java.io.File;
public class ClassExercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\shaik\\OneDrive\\Desktop\\javapractice");
        if(file.exists())
        {
        System.out.println(filesize_in_Bytes(file));
        System.out.println(filesize_in_kiloBytes(file));
        System.out.println(filesize_in_megaBytes(file));
        }
        else 
        System.out.println("File doesn't exist");
         
    }
 
    private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }
 
    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }
 
    private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";
    }
 
	}


