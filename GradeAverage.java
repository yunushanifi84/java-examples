import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int quiz,midterm,ffinal;
		System.out.print("Enter Quiz Grade: ");
		quiz = input.nextInt();
		System.out.print("Enter Midterm Grade: ");
		midterm= input.nextInt();
		System.out.print("Enter Final Grade: ");
		ffinal= input.nextInt();
		double average;
		average = (quiz*0.2)+(midterm*0.35)+(ffinal*0.45);
		System.out.println("Your Average: "+average);
		boolean check = (average >=50);
		String result = check ? "Passed":"Failed";
		System.out.println(result);
		
	}

} 