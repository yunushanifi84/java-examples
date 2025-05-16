import java.util.Scanner;
public class WhileExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Powers of 2 up to the entered number
		
		Scanner input=new Scanner(System.in);
		int number,i=1,product=1;
		System.out.print("Enter a Number:");
		number=input.nextInt();
		while(i<=number) {
			product=2*i;
			i++;
		}
		
	}

} 