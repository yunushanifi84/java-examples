import java.util.Scanner;
public class whileornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden 
		// ve girilen değerlerden tek sayıları toplayan program
		Scanner scanf=new Scanner(System.in);
		int toplam=0,sayi;
		while(true) {
			System.out.print("Bir Sayı Giriniz:");
			sayi=scanf.nextInt();
			if(sayi<0)
				break;
			if((sayi%2)==0) {
				sayi++;
				continue;
			}
			else {
				toplam+=sayi;
			}
			sayi++;
		}
		System.out.println("Girdiğiniz Tek Değerler Toplamı:"+toplam);
	}

}
