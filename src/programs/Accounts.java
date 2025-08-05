package programs;
class Bank{
	String name;
	int accno;
	int password;
	public void printInfo(String name,int accno,int password) {
		 
		
	}
	public int getpassword() {
	 return this.password;
	}
	public void setpassword(int pass) {
		this.password=pass;
		
	}
}
public class Accounts {

	public static void main(String[] args) {
		Bank details=new Bank();
		details.name="fufh";
		details.accno=1234;
//		details.password=2345;
		details.setpassword(2356);
		details.getpassword();
		// TODO Auto-generated method stub

	}

}
