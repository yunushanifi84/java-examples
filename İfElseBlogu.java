import java.util.Scanner;

public class İfElseBlogu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Atama = new Scanner(System.in);
		int BirinciSayi,IkinciSayi;
		System.out.print("1.Sayiyi giriniz:");
		BirinciSayi = Atama.nextInt();
		System.out.print("2.Sayiyi giriniz:");
		IkinciSayi = Atama.nextInt();
		boolean Kontrol = (BirinciSayi==IkinciSayi);
		if(Kontrol) {
			System.out.println("Sayilar Esit");
		}
		else {
			System.out.println("Sayilar Esit Degil");
		}
	}

}
