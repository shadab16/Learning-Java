/**
 * 
 */
package myFirstPackage;

/**
 * @author Shadab
 *
 */
public class IntTest {

	public static void main(String[] args) {
		
		System.out.println("Loop Start :::");
		
		for (int i = 1; i <= 10000; i *= ++i) {
			
			System.out.println("The value of i is = " + i);
		}
		
		System.out.println("Loop End :::");
	}
}