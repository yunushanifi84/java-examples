public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program that prints even numbers from 1 to 100:
		
		int number=1;
		while(number<=100) {
			if((number%2)==0) {
				System.out.print(number+",");
			}
			number++;
		}
	
	}

} 