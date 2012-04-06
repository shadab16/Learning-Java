package myFirstPackage;

public class RightTriangle {
	
	public static void main(String[] args) {

		int side1 = 3;
		int side2 = 4;
		int side3 = 5;
		
		boolean result = isRightTriangle(side1, side2, side3);
		
		System.out.println(result);
	}
	
	private static boolean isRightTriangle(int x, int y, int z) {

		if (
				(x * x + y * y == z * z) ||
				(x * x + z * z == y * y) ||
				(y * y + z * z == x * x))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
