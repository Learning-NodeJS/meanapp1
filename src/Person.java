public class Person{
	private String fname;
	private String lname;
	private int age;
	public Person(String fname, String lname, int age){
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public void setFirstName(String fname){
		this.fname = fname;
	}

	public void setLastName(String lname){
		this.lname = lname;
	}
}