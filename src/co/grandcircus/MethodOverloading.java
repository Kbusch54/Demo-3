package co.grandcircus;

public class MethodOverloading {

	
	//methods go here
	
	public static void main(String[] args) {
		

		int test = modifyMe(5);
		System.out.println(test);
		double stringTest = modifyMe("7");
		System.out.println(stringTest);
		System.out.println(modifyMe("kevin" , 24));

	}

	
	
	//methods go here
	// method overloading
	// 1. methods have to have the same name (don't have to be the same return type)
	// 2. must have one of the following differences:
	//	a. different parameters 
	//	b. different parameter order
	//	c. different amount of parameters
	
	private static int modifyMe(int num) {
		return num*5;
	}
	
	private static int modifyMe(int num, int num2) {
		return num + num2;
	}
	public static double modifyMe (String num) {
		double conversion = Double.parseDouble(num);
		return conversion * .5;
	}
	//this wont work bc the types are still the same type and have the same amount of parameters
//	private static int modifyMe(int num2, int num) {
//		return 0;
//	}
	
	private static String modifyMe(String name, int num) {
		System.out.println(name);
		return name + num;
	}
	
	
}
