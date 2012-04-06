package myFirstPackage;


public class OddNumbers {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		int oddSum = 0;
		double oddAvg = 0;
		int i = 1;
		
		do {
			// (i % 2 == 0) makes it even
			
			if (i % 2 != 0)
			{
				oddSum += i;
				count++;
				
				// System.out.println("Number = " + i + " , Sum = " + oddSum + " , Count = " + count);
			}
			i++;
			
		} while (count < 10);
		
		oddAvg = oddSum / count;
		
		System.out.println("Sum = " + oddSum + " , Average = " + oddAvg);
	}
	
}
