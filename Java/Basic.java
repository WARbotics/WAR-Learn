//Named after your file name and consider the main class
public class Basic {
	//Global Variable
	public static String myName = "Victor";
	public static void main (String[] args) {
		// What gets run 
		//logic goes here
		// Constructor 
		BasicClass b = new BasicClass("John");
		System.out.println("Basic Class Name: " + b.getName());
		System.out.println("Global name: "+ Basic.myName);
		System.out.println(b.getName() + " grade is: " + b.getGrade(2));
		System.out.println("Before setter: "+ b.getAge());
		b.setAge(18);
		System.out.println("After setter: " + b.getAge());
		
		if(b.getAge() >= 18) {
			System.out.println("you are an adult");
		}
		else {
			System.out.println("You are not an adult");
		}
	}
}
// Normal Class
class BasicClass{
	// variables
	String name = "";
	int age = 17;
	int[] grade = {78, 54, 80, 98};
	
	// Constructor Method
	BasicClass(String name) {
		this.name = name;
	}
	
	// Method
	public String getName() {
		return name;
	}
	// Getter method 
	public int getGrade(int term){
		return grade[term];
	}
	
	public int setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age; 
	}
}

/*
 * This is a long comment 
 * 
 * 
 * 
 */

//This is a short comment 