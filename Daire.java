import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yaricapini giriniz: ");
		int yaricap;
		yaricap = input.nextInt();
		double pi=3.14159265358979323846,Alan,Cevre;
		Alan=pi*(yaricap*yaricap);
		Cevre=(2*pi*yaricap);
		System.out.println("Dairenin Cevresi: "+Cevre);
		System.out.println("Dairenin Alani: "+Alan);
	}

}
