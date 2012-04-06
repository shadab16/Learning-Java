class Exp10
{
	public static void main(String[] args)
	{
		try
		{
			double x = 10 / 0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught an exception!");
		}
	}
}
