package myFirstPackage;

public class Looping2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		calculateViaNumber();
		calculateViaString();
	}
	
	private static void calculateViaNumber()
	{
		int reverse = 0;
		int number = 563;
		int x = 0;
		
		while (number > 0)
		{
			x = number % 10;
			number = number / 10;
			
			reverse = (reverse * 10) + x;
		}
		
		System.out.println("Reverse = " + reverse);
	}
	
	private static void calculateViaString()
	{
		int number = 563;
		String stringO = number + "";
		
		String stringR = "";
		int reverse = 0;
		
		for (int i = stringO.length() - 1; i >= 0; i--)
		{
			System.out.println("Character at position " + i + " = " + stringO.charAt(i));
			stringR = stringR + stringO.charAt(i);
		}
		
		reverse = Integer.parseInt(stringR);
		
		System.out.println(reverse);
	}
	
}