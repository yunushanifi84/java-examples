import java.util.Scanner;

public class VeriAlma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Ilk degiskeni giriniz:");
		int x,y;
		x = input.nextInt();
		System.out.print("Ikinci degiskeni giriniz:");
		y = input.nextInt();
		int toplam=x+y,cikarim=x-y,carpim=x*y,bolum=x/y,mod=x%y;
		System.out.println("Toplamlari : "+toplam);
		System.out.println("Farklari : "+cikarim);
		System.out.println("Carpimlari : "+carpim);
		System.out.println("Bolumlari : "+bolum);
		System.out.println("Modu : "+mod);
		boolean kontrol = (x==y);
		String Sonuc = kontrol ? "Esitler" : "Esit Degiller";
		System.out.println(Sonuc);
	}

}
