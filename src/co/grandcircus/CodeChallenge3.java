package co.grandcircus;

import java.util.Scanner;

public class CodeChallenge3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please put in your age");
		int age2 = (scan.nextInt());
		System.out.println("you have been alive for " + ageInDays(age2) + " days");
		if (daysUntil75(age2) <= 0) {
			System.out.println(Math.abs(daysUntil75(age2)) + " days past 75");
		} else {
			System.out.println(daysUntil75(age2) + " days until you are 75 years old. And probably dead!!");
		}
		scan.close();
	}

	// your methods should go here

	private static int ageInDays(int age) {
		int alive = age * 365;
		return alive;
	}

	private static int daysUntil75(int x) {
		int old = 27375 - ageInDays(x);
		return old;
	}

}
