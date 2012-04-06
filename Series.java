class Series
{
	public static double series1(int x, int n)
	{
		double sum = 1;
		for (int i = 2; i <= n; ++i)
		{
			sum += (double) x / factorial(i);
		}
		return sum;
	}

	public static double series2(int x, int n)
	{
		double sum = 1;
		for (int i = 2; i <= n; ++i)
		{
			sum += Math.pow(x, i) / factorial(i);
		}
		return sum;
	}

	public static double series3(int x, int n)
	{
		double sum = 1;
		for (int i = 2; i <= n; ++i)
		{
			sum += Math.pow(x, i) / factorial(2*i+1);
		}
		return sum;
	}

	public static double series4(int x, int n)
	{
		double sum = 1;
		for (int i = 2; i <= n; ++i)
		{
			sum += Math.pow(x, i) / factorial(i) * Math.pow(-1, i);
		}
		return sum;
	}

	public static double series5(int x, int n)
	{
		double sum = x;
		for (int i = 2; i <= n; ++i)
		{
			sum += Math.pow(x, 2*i-1) / factorial(2*i+1);
		}
		return sum;
	}

	public static double series6(int x, int n)
	{
		double sum = 0;
		for (int i = 1; i <= n; ++i)
		{
			sum += Math.pow(x, 2*i-1) / factorial(i);
		}
		return sum;
	}

	public static double series7(int x, int n)
	{
		double sum = x;
		for (int i = 2; i <= n; i += 2)
		{
			sum += Math.pow(x, i) / factorial(i-1);
		}
		return sum;
	}

	public static double series8(int x, int n)
	{
		double sum = x;
		for (int i = 2; i <= n; i += 2)
		{
			long f = 1;
			for (int j = 1; j <= i*i; ++j)
			{
				f *= j;
			}

			sum += Math.pow(x, i) / f;
		}
		return sum;
	}

	public static double factorial(int n)
	{
		long f = 1;
		for (int j = 1; j <= n; ++j)
		{
			f *= j;
		}
		return f;
	}

	public static void main(String[] args)
	{
		double result = series8(2, 2);

		System.out.println("Summation = " + result);
	}
}
