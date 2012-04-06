package funWithLooping;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		int count = 10;
		int i = 0;
		
		while (count > 0) {
			System.out.println(++i + "\t- " + getRandomNumber());
			count--;
		}
	}
	
	private static long getRandomNumber() {
		
		long number = 0;
		
		while (number < Math.pow(10, 11)) {
			number = (number * 10) + (long) (Math.random() * 10);
		}
		
		return number;
	}
	
}
