public class Student {
	
	private String name;
	private int number;
	private int level;

	public Student (String name, int number, int level) {
		this.name = name;
		this.number = number;
		this.level = level;
	}

	public String getName () {
		return this.name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int number () {
		return this.number;
	}

	public void setNumber (int number) {
		this.number = number;
	}

	public int getLevel () {
		return this.level;
	}

	public void setLevel (int level) {
		return this.level;
	}

	public String toString () {
		return "Admission number: " + this.number + " Name: " + this.name + " Class: " + this.level;
	}
}
