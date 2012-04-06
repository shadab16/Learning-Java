package funWithLooping;

public class Summation {
	
	public static void main(String[] args) {

		int total = 0;
		
		for (int i = 1; i <= 4; i++) {
		
			total = total + i;
		}
		
		System.out.println("Total: " + total);
	}
	
}
