import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int number;
		while(true) {
			System.out.print("Enter a Number:");
			number=input.nextInt();
			if(number==0) 
				break;
		}
	}

} 