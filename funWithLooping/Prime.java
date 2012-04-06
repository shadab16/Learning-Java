package funWithLooping;

public class Prime {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		int[] numbers = getPrimeNumbers(5000);
		long endTime = System.currentTimeMillis();
		
		int j = 0;
		
		for (int i : numbers)
		{
			if (j % 20 == 0)
			{
				System.out.println();
			}
			j++;
			
			System.out.print(i + " ");
		}
		
		System.out.println("\n\nTime taken to execute :: " + (endTime - startTime) + " ms");
	}
	
	private static int[] getPrimeNumbers(final int count) {
		
		int[] primeNumbers = new int[count];
		int numberCount = 0;
		int numberToCheck = 2;
		
		while (numberCount < count)
		{
			if (isPrime2(numberToCheck) == true)
			{
				primeNumbers[numberCount] = numberToCheck;
				numberCount++;
			}
			numberToCheck++;
		}	
		
		return primeNumbers;
	}
	
	@SuppressWarnings("unused")
	private static boolean isPrime(final int number) {
		
		if (number < 2 || (number % 2 == 0 && number != 2))
		{
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(number); i += 2)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean isPrime2(final int number) {
		
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
}
