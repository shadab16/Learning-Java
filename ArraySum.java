class ArraySum
{
	public static double sumNum(int[] nums)
	{
		double sum = 0;
		for (int i: nums)
		{
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int[] numbers = {
			1, 2, 3, 4, 5,
			1, 2, 3, 4, 5
		};

		double result = sumNum(numbers);
		System.out.println("Result = " + result);
	}
}