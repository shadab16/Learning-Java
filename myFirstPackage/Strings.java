/**
 * 
 */
package myFirstPackage;

/**
 * @author Shadab
 *
 */
public class Strings {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "Foo";
		String s2 = "Foo";
		String s3 = new String("Foo");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		
		char[] c1 = {'H', 'E', 'L', 'L', 'O'};
		
		for (char c2 : c1)
		{
			System.out.print(c2);
		}
		
		System.out.println();
	}
	
}
