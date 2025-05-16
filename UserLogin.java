import java.util.Scanner;
public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Your Username:");
		String username=input.nextLine();
		System.out.print("Enter Your Password:");
		String password=input.nextLine();
		if(username.equals("Hanifi")&&password.equals("1436xyzt")) {
			System.out.println("Login Successful!");
		}
		else {
			System.out.println("Username Or Password Incorrect");
		}
	
	}
	

} 