import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;
public class FlightTicketCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int distance,age,choice;
		System.out.print("Enter the Distance:");
		distance=input.nextInt();
		System.out.print("Enter Your Age:");
		age=input.nextInt();
		System.out.println("(1=One Way)(2=Round Trip)Select Trip Type:");
		choice=input.nextInt();
		double normalPrice,price = 0;
		if((age<=0)||(distance<=0)) {
			System.out.println("The Values You Entered Are Incorrect");
		}
		else {
			System.out.println("The Values You Entered Are Correct");
			if(choice==1) {
				normalPrice=distance*0.10;
				if(age<12) {
					price=normalPrice/2;
				}
				else if(age<24) {
					price=normalPrice-(normalPrice*0.1);
				}
				else if(age>65) {
					price=normalPrice-(normalPrice*0.3);
				}
				else {
					price=normalPrice;
				}
			}
			else if(choice==2) {
				normalPrice=distance*0.10*2;
				if(age<12) {
					price=normalPrice/2;
				}
				else if(age<24) {
					price=normalPrice-(normalPrice*0.1);
				}
				else if(age>65) {
					price=normalPrice-(normalPrice*0.3);
				}
				else {
					price=normalPrice;
				}
				price=price-(price*0.2);
			}
			System.out.println("Your Amount Has Been Calculated!");
			System.out.println("Amount to Pay:"+price);
		}
		
		
	}

} 