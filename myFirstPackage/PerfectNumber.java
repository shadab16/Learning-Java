package myFirstPackage;


public class PerfectNumber {
	
	public static void main(String[] args) {

		int number = 29;
		int sum = 0;
		
		for (int i = 1; i < number; i++)
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		
		System.out.println((sum == number) ? "YES" : "NO");
		
		/*
		if (sumOfDivisors == numberToCheck)
		{
			System.out.println("Yes, " + numberToCheck + " is a perfect Number");
		}
		else
		{
			System.out.println("No, " + numberToCheck + " is not a perfect Number");
		}
		*/
	}
	
}
