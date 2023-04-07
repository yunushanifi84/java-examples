import java.util.Scanner;
public class AtmUygulamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Verial = new Scanner(System.in);
		int Bakiye=3000,tutar;
		boolean Kontrol=true;
		while(Kontrol) {
			System.out.println("1-Para Yatır\n2-Para Çek\n3-Bakiye Sorgulama\n4-Kart İade");
			System.out.print("Yapmak istediğiniz işlemi şeçiniz:");
			int islem=Verial.nextInt();
			switch(islem) {
			case 1:
				System.out.println("Yatırmak İstediğiniz Tutarı Giriniz:");
				tutar=Verial.nextInt();
				System.out.println("Paranız Yatırılıyor....");
				Bakiye+=tutar;
				System.out.println("Paranız Yatırıldı.");
				System.out.println("Güncel Bakiyeniz:"+Bakiye);
				break;
			case 2:
				System.out.println("Çekmek İstediğiniz Tutarı Giriniz:");
				tutar=Verial.nextInt();
				if(tutar<=Bakiye) {
					System.out.println("Yetersiz Bakiye");
					break;
				}
				Bakiye-=tutar;
				System.out.println("Paranız Çekiliyor.....");
				System.out.println("Parayı Hazneden Alınız.");
				System.out.println("Kalan Bakiyeniz:"+Bakiye);
				break;
			case 3:
				System.out.println("Güncel Bakiyeniz:"+Bakiye);
				break;
			
			case 4:
				System.out.println("Kartınız İade Ediliyor...");
				System.out.println("İyi Günler dileriz :D");
				Kontrol = false;
				break;
			}
		}
	}

}
