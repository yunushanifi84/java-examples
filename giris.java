import java.util.Scanner;

public class giris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Sifre = "1436xyzt";
		Scanner VeriAl = new Scanner(System.in);
		String GirilenSifre;
		GirilenSifre=VeriAl.nextLine();
		if(GirilenSifre.equals(Sifre)) {
			System.out.println("Giriş Başarılı!");
		}
		else {
			System.out.println("Giriş Başarısız!");
		}
	}

}
