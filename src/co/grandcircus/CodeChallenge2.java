package co.grandcircus;

import java.util.Scanner;

public class CodeChallenge2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit = true;
		int win = 0;
		int loss = 0;

		System.out.println("1. Wins");
		System.out.println("2. Losses");
		System.out.println("3. Exit");
		System.out.println("Enter 1 to enter a win, 2 to enter a loss and 3 to exit and recieve total!");
		
		while(exit) {
			int x = scan.nextInt();	
			if (x == 1) {
				win ++;
				
			}
			else if (x == 2) {
				loss++;
			}
			else if (x == 3) {
				exit = false;
			}
			else {
				System.out.println("You did not enter the correct data");
			}
		}
		System.out.println("Wins: "+ win);
		System.out.println("Losses: "+ loss);
		System.out.println("Thanks");
		
		
		
		
		
		scan.close();
	}

}
