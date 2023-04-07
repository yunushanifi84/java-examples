import java.util.Scanner;
public class EtkinlikOnerme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Verial=new Scanner(System.in);
		System.out.print("Havanın Sıcaklığını Giriniz:");
		int Sicaklik=Verial.nextInt();
		if(Sicaklik>=30) {
			System.out.println("Yüzme Etkinliği Önerildi.");
		}
		else if(Sicaklik>=5) {
			System.out.println("Sinema Etkinliği Önerildi.");
		}
		else if(Sicaklik<=4) {
			System.out.println("Kayak Etkinliği Önerildi.");
		}
		
		
	}

}
