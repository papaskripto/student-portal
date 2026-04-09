public class Student {

	private String name;
	private String admissionNumber;

	public Student (String name, String admissionNumber) {
		this.name = name;
		this.admissionNumber = admissionNumber;
	}

	private String getName () {
		return this.name;
	}

	private void setName (String newName) {
		this.name = newName;
	}

	private String getAdmissionNumber () {
		return this.admissionNumber;
	}

	private void setAdmissionNumber (String newAdmissionNumber) {
		this.admissionNumber = newAdmissionNumber;
	}

	public String toString () {
		return this.name + ": " + this.admissionNumber;
	}
}
