import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

class UserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("\r\n|\r|\n");
		
		try
		{
			System.out.println("Enter an integer: ");
			int x = sc.nextInt();

			System.out.println("Enter a string: ");
			String s1 = sc.next();

			System.out.println("Enter another string: ");
			String s2 = sc.next();

			System.out.println("\nValues entered: '" + x + "', '" + s1 + "', '" + s2 + "'.");
		}
		catch (InputMismatchException e)
		{
			System.err.println("Invalid value entered.");
		}
		catch (NoSuchElementException e)
		{
			System.err.println("No value entered.");
		}
	}
}