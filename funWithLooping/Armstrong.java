package funWithLooping;

/**
 * @author Shadab
 */
public class Armstrong {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int limit = 10000;
		
		System.out.println("Narcissistic Numbers in Base 10 :: Upto " + limit);
		System.out.println();
		
		for (int i = 0; i <= limit; i++)
		{
			check(i, false);
		}
	}
	
	/**
	 * Performs a check on the given number by calling the static method 
	 * {@link #isArmstrongNumber(int) isArmstrongNumber()} and displays the result
	 * if the return value is TRUE or the displayFalse parameter is TRUE.
	 * 
	 * @param number The number to check.
	 * @param displayFalse Display the result even if its FALSE.
	 */
	private static void check(int number, boolean displayFalse) {
		
		boolean result = isArmstrongNumber(number);
		
		if (result == true || displayFalse == true)
		{
			System.out.println(number + "\t=> " + result);
		}
	}

	/**
	 * Checks if the given number is an Armstrong Number of not.
	 * An Armstrong number (also known as a Narcissistic number) is a number that is
	 * the sum of its own digits each raised to the power of the number of digits.<br />
	 * <br />
	 * For example: 153 is narcissistic, since 153 = 1^3 + 5^3 + 3^3.
	 * 
	 * @param number The number to check.
	 * @return TRUE if the number is an Armstrong Number, else FALSE.
	 */
	private static boolean isArmstrongNumber(final int number) {
		
		int digits = Integer.toString(number).length();
		int sum = 0;
		int nCopy = number;
		
		while (nCopy > 0)
		{
			sum += Math.pow(nCopy % 10, digits);
			nCopy /= 10;
		}
		
		return (sum == number);
	}
	
}
