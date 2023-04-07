import java.util.Scanner;

public class KdvHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double urun,kdv=0.18,kdvlifiyat;
		Scanner input = new Scanner(System.in);
		System.out.print("Urunun Fiyatini giriniz: ");
		urun = input.nextDouble();
		kdvlifiyat=urun + (urun*kdv);
		System.out.println("Urunun kdv'li fiyati : "+kdvlifiyat);
		
	}

}
