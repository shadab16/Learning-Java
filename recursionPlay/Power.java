package recursionPlay;

/**
 * @author Shadab
 */
public class Power {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Power test = new Power();
				
		System.out.println("0 ^ 0 = " + test.power(0, 0));
		System.out.println("0 ^ 1 = " + test.power(0, 1));
		System.out.println("1 ^ 0 = " + test.power(1, 0));
		System.out.println("1 ^ 1 = " + test.power(1, 1));
		System.out.println("1 ^ 10 = " + test.power(1, 10));
		System.out.println("10 ^ 0 = " + test.power(10, 0));
		System.out.println("2 ^ 2 = " + test.power(2, 2));
		System.out.println("2 ^ 10 = " + test.power(2, 10));
	}
	
	public double power(int base, int exponent) {
		
		if (exponent < 0)
		{
			return 1 / power(base, -exponent);
		}
		else if (exponent == 0)
		{
			return 1;
		}
		else
		{
			return base * power(base, exponent - 1);
		}
	}
	
}
