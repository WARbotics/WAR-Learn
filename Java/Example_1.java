
public class Example_1 {
	public static void main(String[] args) {
		int[] myList = { 4, 5, 2, 5, 1, 6, 7 };
		MathClass m = new MathClass();
		m.myFunction(myList, 5);
	}
}

class MathClass {
	public void myFunction(int[] items, int number) {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == number) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println(number + " has been found: " + count);
	}
}