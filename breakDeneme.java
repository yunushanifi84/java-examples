import java.util.Scanner;
public class breakDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf=new Scanner(System.in);
		int sayi;
		while(true) {
			System.out.print("Bir Sayı Giriniz:");
			sayi=scanf.nextInt();
			if(sayi==0) 
				break;
		}
	}

}
