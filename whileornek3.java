import java.util.Scanner;
public class whileornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Girilen sayıya kadar olan 2'nin kuvvetleri
		
		Scanner scanf=new Scanner(System.in);
		int sayi,i=1,carpim=1;
		System.out.print("Bir Sayı Giriniz:");
		sayi=scanf.nextInt();
		while(i<=sayi) {
			carpim=2*i;
		}
		
	}

}
