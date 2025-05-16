import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first variable:");
		int x,y;
		x = input.nextInt();
		System.out.print("Enter the second variable:");
		y = input.nextInt();
		int sum=x+y,difference=x-y,product=x*y,quotient=x/y,modulus=x%y;
		System.out.println("Their Sum : "+sum);
		System.out.println("Their Difference : "+difference);
		System.out.println("Their Product : "+product);
		System.out.println("Their Quotient : "+quotient);
		System.out.println("Their Modulus : "+modulus);
		boolean check = (x==y);
		String result = check ? "They are Equal" : "They are Not Equal";
		System.out.println(result);
	}

} 