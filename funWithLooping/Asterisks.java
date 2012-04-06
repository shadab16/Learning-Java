package funWithLooping;

public class Asterisks {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("ASTERISK 1 ::\n");
		asterisk1();
		
		System.out.println("\nASTERISK 2 ::\n");
		asterisk2();
		
		System.out.println("\nASTERISK 3 ::\n");
		asterisk3();
		
		System.out.println("\nASTERISK 4 ::\n");
		asterisk4();
	}
	
	private static void asterisk1() {
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void asterisk2() {
		
		for (int i = 5; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void asterisk3() {
				
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5 - i; j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void asterisk4() {
		
		for (int i = 1; i <= 5; i += 2)
		{
			for (int j = 1; j <= (5 - i) / 2; j++)
			{
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
