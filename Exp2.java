class Exp2
{
	public static void main(String[] args)
	{
		Exp1 app1 = new Exp1();
		app1.Foo();

		Exp2 app2 = new Exp2();
		app2.Foo();
	}

	public void Foo()
	{
		System.out.println("Foo in Class 2");
	}
}
