import java.util.Scanner;
public class yildiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Verial=new Scanner(System.in);
		int secim=Verial.nextInt();
		int i,j;
		for(i=0;i<secim;i++) {
			for(j=0;j<secim;j++) {
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
