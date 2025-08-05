package programs;
class students{
	String name;
	int rollnum;
	double cgpa;
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.rollnum);
		System.out.println(this.cgpa);
	}
	students(){             //construction thta is non parametic
		System.out.println("enter the student details");
	}
	students(String name,int rollnum,double cgpa){
		this.name=name;//this is know as parametric passing
		this.rollnum=rollnum;
		this.cgpa=cgpa;
		
	}
	students(students s2){
		this.name=s2.name;//this is know as parametric passing for copy constructor
		this.rollnum=s2.rollnum;
		this.cgpa=s2.cgpa;
		
		
	}
}
public class PerformingAlternatives {

	public static void main(String[] args) {
		students details=new students();
		details.name="sha";
		details.rollnum=45;
		details.cgpa=9.2;
		details.printInfo();
		students s2=new students(details) ;//this is for the copy of code
		s2.printInfo();
		// TODO Auto-generated method stub
//		students details=new students("ftg",46,7.4);//for paramatric this is how to pass the values
		details.printInfo();
	}

}
