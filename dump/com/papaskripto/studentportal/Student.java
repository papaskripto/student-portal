public class Student {

	private String name;
	private String admissionNumber;

	public Student (String name, String admissionNumber) {
		this.name = name;
		this.admissionNumber = admissionNumber;
	}

	public String getName () {
		return this.name;
	}

	public String getAdmissionNumber () {
		return this.admissionNumber;
	}

	public String toString () {
		return this.name + "(" + this.admissionNumber + ")";
	}

	// Uncomment to Test Student class here!
	
	//public static void main (String [] args) {
	//	Student john = new Student ("John Oloo", "ADM21");
	//	System.out.println (john);
	//}
}
