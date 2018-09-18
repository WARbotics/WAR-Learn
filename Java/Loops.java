
public class Loops {
	public static void main (String[] args) {
		double[] grades = {98.2, 86.5, 78.3, 95.3};
		int length = 0;
		int count = 0;
		
		// For loop
		for(int i=0; i < grades.length; i++) {
			System.out.println("For loop - Grades: " + grades[i]);
		}
		//While loops 
		while(length < grades.length) {
			System.out.println("While Loop - Grades: " + grades[length]);
			length++;
		}
		
		//Do-while
		do {
			System.out.println("Do While loop - Grades: "+ grades[count]);
			count++;
		} while (count < 4);
 	}
}
