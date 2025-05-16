import java.util.Scanner;

public class IfElseBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int firstNumber, secondNumber;
		System.out.print("Enter the 1st number:");
		firstNumber = input.nextInt();
		System.out.print("Enter the 2nd number:");
		secondNumber = input.nextInt();
		boolean check = (firstNumber == secondNumber);
		if(check) {
			System.out.println("Numbers are Equal");
		}
		else {
			System.out.println("Numbers are Not Equal");
		}
	}

} 