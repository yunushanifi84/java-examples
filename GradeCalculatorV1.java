import java.util.Scanner;
public class GradeCalculatorV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Turkish,Mathematics,Science,SocialStudies,PhysicalEducation;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Your Turkish Grade:");
		Turkish=input.nextInt();
		System.out.print("Enter Your Mathematics Grade:");
		Mathematics=input.nextInt();
		System.out.print("Enter Your Science Grade:");
		Science=input.nextInt();
		System.out.print("Enter Your Social Studies Grade:");
		SocialStudies=input.nextInt();
		System.out.println("Enter Your Physical Education Grade:");
		PhysicalEducation=input.nextInt();
		double average;
		average=(Turkish+Mathematics+Science+SocialStudies+PhysicalEducation)/5;
		System.out.println("Your Average : "+average);
		if(average>=50) {
			System.out.println("You Successfully Passed the Class!");
		}
		else 
			System.out.println("You Failed the Class...");
	
	}

} 