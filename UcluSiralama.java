import java.util.Scanner;
public class UcluSiralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanf = new Scanner(System.in);
		System.out.println("Sayıları Giriniz:");
		int a,b,c;
		a=scanf.nextInt();
		b=scanf.nextInt();
		c=scanf.nextInt();
		if((a>b)&&(a>c)) {
			if(b>c) {
				System.out.println("a > b >c");
			}
			else {
				System.out.println("a > c > b");
			}
		}
		if((b>a)&&(b>c)) {
			if(a>c) {
				System.out.println("b > a > c");
			}
			else {
				System.out.println("b > c > a");
			}
		}
		if((c>a)&&(c>b)) {
			if(a>b) {
				System.out.println("c > a > b");
			}
			else {
				System.out.println("c > b > a");
			}
		}
		
		
		
	
	}

}
