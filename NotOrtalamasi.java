import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int quiz,vize,ffinal;
		System.out.print("Quiz Notunu Giriniz: ");
		quiz = input.nextInt();
		System.out.print("Vize Notunu Giriniz: ");
		vize= input.nextInt();
		System.out.print("Final Notunu Giriniz: ");
		ffinal= input.nextInt();
		double ortalama;
		ortalama = (quiz*0.2)+(vize*0.35)+(ffinal*0.45);
		System.out.println("Ortalamaniz : "+ortalama);
		boolean kontrol = (ortalama >=50);
		String Sonuc = kontrol ? "Gectiniz":"Kaldiniz";
		System.out.println(Sonuc);
		
	}

}
