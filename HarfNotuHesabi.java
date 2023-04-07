import java.util.Scanner;

public class HarfNotuHesabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Vize Notunuzu Giriniz:");
		Scanner Verial = new Scanner(System.in);
		int Vize,ffinal;
		double ortalama;
		Vize = Verial.nextInt();
		System.out.print("Final Notunuzu Giriniz:");
		ffinal= Verial.nextInt();
		ortalama=(Vize*0.4)+(ffinal*0.6);
		System.out.println("Ortalamaniz:"+ortalama);
		if(ortalama>=90) {
			System.out.println("Harf Notunuz AA Gectiniz!");
		}
		else if(ortalama>=85) {
			System.out.println("Harf Notunuz BA Gectiniz!");
		}
		else if(ortalama>=80) {
			System.out.println("Harf Notunuz BB Gectiniz!");
		}
		else if(ortalama>=75) {
			System.out.println("Harf Notunuz CB Gectiniz!");
		}
		else if(ortalama>=65) {
			System.out.println("Harf Notunuz CC Gectiniz!");
		}
		else if(ortalama>=58) {
			System.out.println("Harf Notunuz DC Kosullu Gecme Sarti");
		}
		else if(ortalama>=50) {
			System.out.println("Harf Notunuz DD Gecemediniz...");
		}
		else if(ortalama>=40) {
			System.out.println("Harf Notunuz FD Gecemediniz...");
		}
		else {
			System.out.println("Harf Notunuz FF Gecemediniz...");
		}
	}

}
