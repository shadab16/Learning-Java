package numberPlay;

public class DisplayNumbers {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Even Numbers ::");
		
		int[] even = FirstXNumbers.getEven(10);
		
		for (int n : even)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Odd Numbers ::");
		
		int[] odd = FirstXNumbers.getOdd(10);
		
		for (int n : odd)
		{
			System.out.print(n + " ");
		}
		
		System.out.println();
	}
	
}
