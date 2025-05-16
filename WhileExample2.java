import java.util.Scanner;
public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program that accepts input from the user until a negative value is entered
		// and adds up the odd numbers entered
		Scanner input=new Scanner(System.in);
		int sum=0,number;
		while(true) {
			System.out.print("Enter a Number:");
			number=input.nextInt();
			if(number<0)
				break;
			if((number%2)==0) {
				number++;
				continue;
			}
			else {
				sum+=number;
			}
			number++;
		}
		System.out.println("Sum of Odd Numbers You Entered:"+sum);
	}

} 