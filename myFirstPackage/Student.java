package myFirstPackage;

public class Student {
	
	private String fullName;
	private int[] marks = new int[3];
	private int marksSum;
	private float marksAvg;
	
	public static void main(String[] args) {

		Student student1 = new Student();
		student1.compute();
		student1.display();
	}

	public Student() {
		
		// Random full name
		fullName = "Shadab Ansari";
		
		// Random marks for 3 subjects
		marks[0] = 50;
		marks[1] = 80;
		marks[2] = 75;
	}
	
	private void compute() {
		
		marksSum = marks[0] + marks[1] + marks[2];
		marksAvg = marksSum / 3;
	}
	
	private void display() {
		
		System.out.println("Name of Student: " + fullName);
		System.out.println("Marks of Subject 1: " + marks[0]);
		System.out.println("Marks of Subject 2: " + marks[1]);
		System.out.println("Marks of Subject 3: " + marks[2]);
		System.out.println("Sum = " + marksSum + " , Average = " + marksAvg);
	}
	
}
