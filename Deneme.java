import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String x,y,z;
		System.out.print("Ilk Kelimeyi girin: ");
		x = input.nextLine();
		System.out.print("Ikinci Kelimeyi girin: ");
		y = input.nextLine();
		System.out.print("Ucuncu Kelimeyi girin: ");
		z = input.nextLine();
		System.out.println(x+"\\"+y+"\\"+z);
	}

}
