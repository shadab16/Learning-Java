class Card
{
	private int rank;
	private char suit;

	Card(int rank, char suit)
	{
		this.rank = rank;
		this.suit = suit;
	}

	int getRank()
	{
		return rank;
	}

	char getSuit()
	{
		return suit;
	}
}

class Test
{
	public static void main(String args[])
	{
		Card aoD = new Card(1, 'd');

		System.out.println(aoD.getSuit() + " " + aoD.getRank());
	}
}
