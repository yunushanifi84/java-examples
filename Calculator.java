import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int choice,number1,number2;
		double result = 0;
		System.out.println("Enter the First Number:");
		number1=input.nextInt();
		System.out.println("Enter the Second Number:");
		number2=input.nextInt();
		System.out.println("-------------------------------------------------");
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\nSelect the Operation You Want to Perform:");
		choice=input.nextInt();
		switch(choice) {
		case 1:
			result=number1+number2;
			break;
		case 2:
			System.out.println("Subtracting smaller number from larger number..");
			if(number1>number2) {
				result=number1-number2;
			}
			else {
				result = number2-number1;
			}
			break;
		case 3:
			result=number1*number2;
			break;
		case 4:
			result=number1/number2;
			break;
		}
		System.out.println("Result of the Selected Operation:"+result);
	}

} 