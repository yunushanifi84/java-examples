import java.util.Scanner;
public class kullanicigirisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner VeriAl=new Scanner(System.in);
		System.out.print("Kullanıcı Adınızı Girin:");
		String K_Adi=VeriAl.nextLine();
		System.out.print("Kullanıcı Şifrenizi Girin:");
		String Sifre=VeriAl.nextLine();
		if(K_Adi.equals("Hanifi")&&Sifre.equals("1436xyzt")) {
			System.out.println("Giriş Başarılı!");
		}
		else {
			System.out.println("Kullanıcı Adı Veya Şifre Hatalı");
		}
	
	}
	

}
