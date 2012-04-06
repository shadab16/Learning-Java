class Exp8
{
	public static void main(String[] args)
	{
		Creature shadab = new Human("Shadab", 19);

		System.out.println(
			shadab.getName() + "\n" +
			shadab.getAge() + "\n" +
			shadab.getType()
		);
	}
}

interface Creature
{
	public String getName();
	public Integer getAge();
	public String getType();
}

abstract class AdvancedCreature implements Creature
{
	protected String name;
	protected Integer age;

	public AdvancedCreature(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}

	public Integer getAge()
	{
		return this.age;
	}
}

class Human extends AdvancedCreature
{
	public Human(String name, Integer age)
	{
		super(name, age);
	}

	public String getType()
	{
		return "Human, 2-hands, 2-legs.";
	}
}
