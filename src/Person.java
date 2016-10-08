public class Person{
	private String fname;
	private String lname;

	public Person(String fname, String lname){
		this.setFirstName(fname);
		this.setLastName(lname);
	}

	public void setFirstName(String fname)throw IllegalArgumentException{
		if(fname.isEmpty())
			throws new IllegalArgumentException("Cannot pass empty fname");
		this.fname = fname;
	}

	public void setLastName(String lname)throw IllegalArgumentException{		
		if(fname.isEmpty())
			throws new IllegalArgumentException("Cannot pass empty fname");
		this.lname = lname;
	}
}