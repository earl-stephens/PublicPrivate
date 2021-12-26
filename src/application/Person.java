package application;

public class Person {
	/* These instance variables are not meant to be accessed outside
	 * the class.  They are private
	 */
	private String name;
	private int age;

	/* These four methods are meant to be accessed outside
	 * the class, so they are public
	 * 
	 * Public makes it explicit that these are meant to be shared
	 */
	 public void setName(String theName) {
		name = theName;
	}

	 //public methods are ways of interfacing with the class
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
