package co.grandcircus;



public class ForLoop {

	public static void main(String[] args) {
		
		
//		//count 1 to 10
		int d = 5;
		for(int i = 1; i <= d;i++) {
			System.out.println( i);
			
		}
		//count 10 to 1
		for(int x =10; x>=1;x--) {
			System.out.println("Loop " + x);
		}
		//count 2 to 20 by 2 or only even numbers
		for(int y = 2; y <=20; y += 2) {
			System.out.println("Loop in my shoe " + y);
		}
		
		
//		enhanced loop 
		int[] numArray = {34, 63, 54, 29, 12, 1};
		for(int num : numArray) {
			System.out.println(num);
			
		}
		
		System.out.println("Standard for loop iteration: ");
		for(int z = 0; z < numArray.length; z++){
			System.out.println(numArray[z]);
		}
		
		
		

	}

}
