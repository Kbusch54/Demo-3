package co.grandcircus;

import java.util.Scanner;

public class MethodDemo {
// can write methods up here
	public static void main(String[] args) {
//		methods do not go into the main bc that is in of itself a method

		sayHello();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name?");
		String userInput = scan.nextLine();

		String name = sayHelloName(userInput);
		System.out.println(name);

		testing(scan);
		//knight call
		System.out.println(knightMe("Grand", "Circus"));

		int remainderTest = findRemainder(9,5);
		System.out.println(remainderTest);
		
		System.out.println(testEven(34));
		
		// Robot Demo for static reference 
		
		System.out.println(Robot.helloRobot());
		
		
		
		
		scan.close();
	}
// or we can write methods here

	/*
	 * 5 steps for writing methods: 
	 * 1. visibility modifier (required): public or private 
	 * 2. static or nothing
	 * 3. return type: should match what you are trying to return 
	 * 4. method name: should be a verb to show some type of action 
	 * 5.parameter list: things that we need inside the method, can be blank
	 */

	public static void sayHello() {
		System.out.println("Hello World!");

		return; // return for void methods is optional
	}

//	because this method has a return type we need to put a value returned
//	in a sys out to see it 

	public static String sayHelloName(String name) {

//		the return type should always match the type in the method signature
		return "Hello, " + name;

	}

	public static void testing(Scanner scan) {
		System.out.println("Put something in ");
		String testing = scan.nextLine();
		System.out.println(testing);

	}
	
	public static String knightMe(String fName, String lName) {
		fName = fName.toUpperCase();
		
		return "Sir " + fName +" "+ lName;
	}
	//this method can only be used inside of this class (bc it is private)
	private static int findRemainder(int x, int y) {
		
		return x%y;
	}
	private static boolean testEven(int num) {
		if (num % 2 ==0) {
			return true;
		}
		return false;
	}

}
