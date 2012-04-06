package myFirstPackage;

public class TriangleType {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		int c = 8;
		
		String triangleType = getTriangleType(a, b, c);
		
		System.out.println(triangleType);
	}
	
	private static String getTriangleType(int x, int y, int z) {
		
		/*
		if ((x + y <= z) || (x + z <= y) || (y + z <= x))
		{
			return "Not a Triangle";
		}
		*/
		
		if ((x == y) && (y == z))
		{
			return "Equilateral";
		}
		
		if ((x == y) || (y == z) || (x == z))
		{
			return "Isosceles";
		}
		
		return "Scalene";
	}
	
}
