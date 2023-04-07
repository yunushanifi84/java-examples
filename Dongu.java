import java.util.Scanner;
public class Dongu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kaça Kadar Sayılacağını Girin:");
		Scanner scanf=new Scanner(System.in);
		int Sayi=scanf.nextInt();
		for(int i=1;i<=Sayi;i++) {
			System.out.print(i+",");
		}
	}
	

}
