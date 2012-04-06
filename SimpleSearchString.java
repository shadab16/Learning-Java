class SimpleSearchString
{
	public static int searchIt(String line, String word)
	{
		if (line.length() < word.length())
		{
			return 0;
		}

		for (int i = 0; i <= line.length() - word.length(); ++i)
		{
			if (line.substring(i, i + word.length()).equals(word))
			{
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args)
	{
		String line = "The quick brown fox jumps over the lazy dog";
		String word = "fox";

		int result = searchIt(line, word);

		System.out.println("Search Result = " + result);
	}
}
