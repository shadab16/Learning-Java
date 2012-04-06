package myFirstPackage;


public class Convert1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		forLoop();
		doLoop();
	}
	
	private static void forLoop()
	{
		int x;
		int c;
		
		for (x = 10, c = 20; c >= 10; c -= 2)
		{
			// System.out.println("x = " + x + " , c = " + c);
			x++;
		}
	}
	
	private static void doLoop()
	{
		int x = 10;
		int c = 20;
		
		do {		
			// System.out.println("x = " + x + " , c = " + c);
			
			x++;			
			c -= 2;
			
		} while (c >= 10);
	}
	
}
