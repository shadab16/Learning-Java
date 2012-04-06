package numberPlay;


public class FirstXNumbers {
	
	private static int[] numbers;
	
	public static int[] getNatural(int count) {
		
		numbers = new int[count];
		
		for (int i = 0; i < count; i++)
		{
			numbers[i] = i;
		}
		
		return numbers;
	}
	
	public static int[] getOdd(int count) {

		numbers = new int[count]; 
		int i = 0;
		int n = 0;
		
		while (i < count)
		{
			if (EvenOddCheck.isOdd(n))
			{
				numbers[i] = n;
				i++;
			}
			n++;
		}
		
		return numbers;
	}
	
	public static int[] getEven(int count) {
		
		numbers = new int[count]; 
		
		int i = 0;
		int n = 0;
		
		while (i < count)
		{
			if (EvenOddCheck.isEven(n))
			{
				numbers[i] = n;
				i++;
			}
			n++;
		}
		
		return numbers;
	}
	
}
