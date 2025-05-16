import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter How Many Numbers to Count:");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print(i+",");
		}
	}
	

} 