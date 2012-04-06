class Exp3
{
	public static void main(String[] args)
	{
		Exp3 app = new Exp3();

		app.Bar();
	}

	public Exp3()
	{
		System.out.println("This runs implicitly!");
	}

	public void Bar()
	{
		System.out.println("Explicit call to Bar() method.");
	}
}
