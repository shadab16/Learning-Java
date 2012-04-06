/**
 * 
 */
package myFirstPackage;

/**
 * @author Shadab
 */
public class Looping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		forLoop();
	}
	
	public static void forLoop() {
		
		int start	= 1;
		int limit	= 5;
		int factor	= 17;
		
		int counter	= 0;
		
		for (int i = start; i <= limit; i++) {
			
			System.out.println("Factor " + ++counter + " = " + i * factor);
		}
		
		System.out.println("DONE :::");
	}

}
