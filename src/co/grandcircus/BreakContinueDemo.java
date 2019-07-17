package co.grandcircus;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// create an infinite loop 
//		we will add a stop condition to make our code exit
		while(true) {
			int randomNum = (int)(Math.random() * 10); // this is going to return a number between zero and 9
			System.out.println(randomNum);
			
			
//			to break out of the loop we need a conditional
//			statement with the break keyword
			if(randomNum==7) {
				System.out.println("You have found lucky number 7");
				break;
			}
		}
		
		System.out.println("\nContinue Example");
		//continue is used to skip any remaining code and go back to
		// top of the loop
		
		
		for ( int i = 0; i < 5; i++) {
			int randomNum = (int)(Math.random() * 10);
			if(randomNum > 7) {
				System.out.println("This " + randomNum + " is greater than 7, go back to the top");
				continue;
			}
			System.out.println(randomNum);
		}
		
		
		
	}

}
