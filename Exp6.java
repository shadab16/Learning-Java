class Exp6
{
	public static void main(String[] args)
	{
		Class2 x = new Class2();

		x.Foo();
		x.Bar();
	}
}

class Class1
{
	public void Foo()
	{
		System.out.println("Foo in Class1.");
	}
}

class Class2 extends Class1
{
	public void Bar()
	{
		System.out.println("Bar in Class2.");
	}
}