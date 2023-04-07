import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;
public class Ucakbiletihesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner VeriAl=new Scanner(System.in);
		int mesafe,yas,secim;
		System.out.print("Mesafeyi Giriniz:");
		mesafe=VeriAl.nextInt();
		System.out.print("Yaşınızı Giriniz:");
		yas=VeriAl.nextInt();
		System.out.println("(1=Tek Gidiş)(2=Gidiş-Dönüş)Yolculuk Tipini Seçiniz:");
		secim=VeriAl.nextInt();
		double NormalFiyat,Fiyat = 0;
		if((yas<=0)||(mesafe<=0)) {
			System.out.println("Girdiğiniz Değerler Yanlış");
		}
		else {
			System.out.println("Girdiğiniz Değerler Doğru");
			if(secim==1) {
				NormalFiyat=mesafe*0.10;
				if(yas<12) {
					Fiyat=NormalFiyat/2;
				}
				else if(yas<24) {
					Fiyat=NormalFiyat-(NormalFiyat*0.1);
				}
				else if(yas>65) {
					Fiyat=NormalFiyat-(NormalFiyat*0.3);
				}
				else {
					Fiyat=NormalFiyat;
				}
			}
			else if(secim==2) {
				NormalFiyat=mesafe*0.10*2;
				if(yas<12) {
					Fiyat=NormalFiyat/2;
				}
				else if(yas<24) {
					Fiyat=NormalFiyat-(NormalFiyat*0.1);
				}
				else if(yas>65) {
					Fiyat=NormalFiyat-(NormalFiyat*0.3);
				}
				else {
					Fiyat=NormalFiyat;
				}
				Fiyat=Fiyat-(Fiyat*0.2);
			}
			System.out.println("Tutarınız Hesaplandı!");
			System.out.println("Ödeyeceğiniz Tutar:"+Fiyat);
		}
		
		
	}

}
