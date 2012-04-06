class Exp5 extends Exp1
{
	public static void main(String[] args)
	{
		Exp1 app1 = new Exp1();

		System.out.println("Output of Foo in Exp1:");
		app1.Foo();

		System.out.println("Output of Foo in Exp5:");
		Exp5 app2 = new Exp5();
		app2.Foo();
	}

	public void Foo()
	{
		System.out.println(17);
	}
}
