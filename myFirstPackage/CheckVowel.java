package myFirstPackage;


public class CheckVowel {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(checkVowel('a'));
		System.out.println(checkVowel('e'));
		System.out.println(checkVowel('X'));
		System.out.println(checkVowel('G'));
		System.out.println(checkVowel('O'));		
	}
	
	private static int checkVowel(char c) {
		
		c = Character.toLowerCase(c); 
		
		switch (c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return 1;
			default:
				return 0;
		}
	}
	
}
