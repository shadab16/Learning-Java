package myFirstPackage;


public class Switch {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char code = 'r';
		
		switch (code)
		{
			case 's':
				System.out.println("Summer");
				break;
			
			case 'r':
				System.out.println("Rainy");
				break;
				
			case 'w':
				System.out.println("Winter");
				break;
				
			default:
				System.out.println("Wrong Code");
				break;
		}
		
	}
	
}
