import java.util.Scanner;
public class NotHesabiV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Turkce,Matematik,Fenbilgisi,SosyalBilgisi,BedenEgitimi;
		Scanner VeriAl=new Scanner(System.in);
		System.out.print("Türkçe Notunuzu Giriniz:");
		Turkce=VeriAl.nextInt();
		System.out.print("Matematik Notunuzu Giriniz:");
		Matematik=VeriAl.nextInt();
		System.out.print("Fen Bilgisi Notunuzu Giriniz:");
		Fenbilgisi=VeriAl.nextInt();
		System.out.print("Sosyal Bilgiler Notunuzu Giriniz:");
		SosyalBilgisi=VeriAl.nextInt();
		System.out.println("Beden Eğitimi Notunuzu Giriniz:");
		BedenEgitimi=VeriAl.nextInt();
		double ortalama;
		ortalama=(Turkce+Matematik+Fenbilgisi+SosyalBilgisi+BedenEgitimi)/5;
		System.out.println("Ortalamanız : "+ortalama);
		if(ortalama>=50) {
			System.out.println("Sınıfı Başarıyla Geçtiniz!");
		}
		else 
			System.out.println("Sınıfı Geçemediniz...");
	
	}

}
