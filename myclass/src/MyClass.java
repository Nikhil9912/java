
public class MyClass {

	static String firstName="Nikhil";
	static String lastName="sharma";
	static int age=23;
	
	static {
		System.out.println("Print Variable using Static Block");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}
	
	static void getFirstName() {
		System.out.println("First Name : "+firstName);
	}
	
	static void getLastName() {
		System.out.println("last Name : "+lastName);
	}
	
	static void getAge() {
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		
	System.out.println("Print variable using static function");
		getFirstName();
		getLastName();
		getAge();
		System.out.println("MyClass print All variabes using static variable");
		System.out.println("First Name : "+firstName);
		System.out.println("last Name : "+lastName);
		System.out.println("Age : "+age);
	}

}