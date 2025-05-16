import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		int i,j;
		for(i=0;i<choice;i++) {
			for(j=0;j<choice;j++) {
				if(i==j) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

} 