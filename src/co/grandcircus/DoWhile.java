package co.grandcircus;

public class DoWhile {

	public static void main(String[] args) {
		
		int counter = 100;
		
		
		// the do loop will always execute at least one time 
		//then it will check condition and if true goes back through 
		do {
			System.out.println("Counter: " +counter--);
			// counter--;
			
		} while(counter > 0);
		
		

	}

}
