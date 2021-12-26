package application;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setName("Joe");
		person1.setAge(35);
		
		/* still can access person1 data directly
		ie. person1.name = "Mary";  
		Really want it so that the Person class has methods/attributes
		that can't be accessed out of the class
		
		Enforce this with public & private keywords
		*/
		
		//This no longer works because the attributes are private
		//System.out.printf("My name is %s and I am %d years old.", person1.name, person1.age);
		
		//use getter methods
		System.out.printf("I am %s and I am %d years old.", person1.getName(), person1.getAge());

	}

}
