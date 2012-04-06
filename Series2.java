class Series2
{
	public static double series1(int n)
	{
		double sum = 0;
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= i; ++j)
			{
				sum += j;
			}
		}
		return sum;
	}

	public static double series2(int n)
	{
		double sum = 0;
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= i; ++j)
			{
				sum += j * 2;
			}
		}
		return sum;
	}

	public static double series3(int n)
	{
		double sum = 0;
		for (int i = 1; i <= n; ++i)
		{
			sum += i * i;
		}
		return sum;
	}

	public static double series4(int n)
	{
		double sum = 0;
		n--;

		for (int i = 0; i <= n; ++i)
		{
			double x = 1;
			for (int j = 1; j <= i; ++j)
			{
				switch(j % 3)
				{
					case 0: x += 3; break;
					case 1: x += 1; break;
					case 2: x += 2; break;
				}
			}
			sum += x;
		}
		return sum;
	}

	public static double series5(int n)
	{
		double sum = 0;

		for (int i = 0; i < n; ++i)
		{
			double x = 1;
			double add = 2;

			for (int j = 1; j <= i; ++j)
			{
				switch(j % 2)
				{
					case 0: x -= 1; break;
					case 1: x += add++; break;
				}
			}
			sum += x;
		}
		return sum;
	}

	public static double series6(int n)
	{
		double sum = 0;

		for (int i = 0; i < n; ++i)
		{
			double x = 0;
			double prev = 1;
			double temp = 0;
			
			for (int j = 1; j <= i; ++j)
			{
				temp = x;
				x += prev;
				prev = temp;				
			}
			sum += x;
		}

		return sum;
	}

	public static double series7(int n)
	{
		double sum = 0;

		for (int i = 0; i < n; ++i)
		{
			sum += Math.pow(i, i+1);
		}

		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println("Summation = " + series6(7));
	}
}
