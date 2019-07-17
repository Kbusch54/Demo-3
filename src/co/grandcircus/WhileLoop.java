package co.grandcircus;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String cont = "yes";

		while (cont.equalsIgnoreCase("yes")) {
// 	your code should start here 
			
			System.out.println("Play");
			
			
//			your logic should stop here if it does not need to be included in the loop
			System.out.println("Do you want to continue?  (Yes/No");
			cont = scan.next();
			
		}

//	this is where your program will end	
		System.out.println("Thanks for playing!");
		scan.close();

		
//		do not use this in your template
		int num = 5;
		if (num == 5) {
			System.out.println("The number is 5");
		}
		
		// set up a while loop like a for loop
		//initilization 
		int i =0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
	}

}
