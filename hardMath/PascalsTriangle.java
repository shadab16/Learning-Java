package hardMath;

public class PascalsTriangle {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		(new PascalsTriangle()).print();
	}
	
	public void print() {

		int limit = 6; // Row Number (not the actual row count); maximum 12.
		float prev = 1; // The previous number in the column
		
		for (float row = 0; row <= limit; row++)
		{
			// For printing a calculated amount of space before a row of number
			// begins; so as to center that row globally.
			for (int i = 0; i < (limit - row) * 2; i++)
			{
				System.out.print(" ");
			}
			
			for (float column = 0; column <= row; column++)
			{
				if (column == 0 || column == row)
				{
					prev = 1;
				}
				else
				{
					prev *= ((row + 1 - column) / column);
				}
				System.out.print(String.format("%-4.0f", prev));
			}
			
			System.out.println();
		}
	}
	
}
