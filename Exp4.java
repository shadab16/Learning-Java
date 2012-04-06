class Exp4
{
	public static void main(String[] args)
	{
		Exp4 app = new Exp4();

		app.Add(16, 8);

		app.Add(1.7, 0.8);
	}

	public void Add(int x, int y)
	{
		System.out.println("Overloaded method 1");

		int z = x + y;
		System.out.println(z);
	}

	public void Add(double x, double y)
	{
		System.out.println("Overloaded method 2");

		double z = x + y;
		System.out.println(z);
	}
}
