import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Verial=new Scanner(System.in);
		int secim,sayi1,sayi2;
		double sonuc;
		System.out.println("İlk Sayıyı Girin:");
		sayi1=Verial.nextInt();
		System.out.println("İkinci Sayıyı Girin:");
		sayi2=Verial.nextInt();
		System.out.println("-------------------------------------------------");
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapmak İstediğiniz İşlemi Seçiniz:");
		secim=Verial.nextInt();
		switch(secim) {
		case 1:
			sonuc=sayi1+sayi2;
			break;
		case 2:
			System.out.println("Büyük sayıdan küçük sayı çıkarıldı..");
			if(sayi1>sayi2) {
				sonuc=sayi1-sayi2;
			}
			else {
				sonuc = sayi2-sayi1;
			}
			break;
		case 3:
			sonuc=sayi1*sayi2;
			break;
		case 4:
			sonuc=sayi1/sayi2;
			break;
		}
		System.out.println("Seçtiğiniz İşlemin Sonucu:"+sonuc);
	}

}
