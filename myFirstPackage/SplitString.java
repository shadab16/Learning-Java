package myFirstPackage;


public class SplitString {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] result = " this  is   a    test    ".trim().split("\\s+");

		for (int i = 0; i < result.length; i++)
		{
			System.out.println("'" + result[i] + "'");
		}
	}
	
}
