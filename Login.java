import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "1436xyzt";
		Scanner input = new Scanner(System.in);
		String enteredPassword;
		enteredPassword=input.nextLine();
		if(enteredPassword.equals(password)) {
			System.out.println("Login Successful!");
		}
		else {
			System.out.println("Login Failed!");
		}
	}

} 