class CountLetters
{
	public static long count(String line)
	{
		long count = 0;
		for (int i = 0; i < line.length(); ++i)
		{
			if (Character.isLetter(line.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		System.out.println(count("test 123"));
	}
}
