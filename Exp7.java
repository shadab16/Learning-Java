class Exp7
{
	public static void main(String[] args)
	{
		WrapperDemo app = new WrapperDemo();

		int x1 = 8;

		app.Foo(x1);
		app.Bar(x1);

		Integer x2 = new Integer(16);

		app.Foo(x2);
		app.Bar(x2);
	}
}


class WrapperDemo
{
	public void Foo(int x)
	{
		System.out.println("Expecting a primitive integer.");
		System.out.println("x = " + x + "\n");
	}

	public void Bar(Integer x)
	{
		System.out.println("Expecting an Integer object.");
		System.out.println("x = " + x + "\n");
	}
}