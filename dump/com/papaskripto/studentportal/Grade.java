public class Grade {

	private String subject;
	private int score;

	public Grade (String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject () {
		return this.subject;
	}

	public int getScore () {
		return this.score;
	}

	public String toString () {
		return this.subject + ": " + this.score;
	}

	// Uncomment this to test Grade class
	
	// public static void main (String [] args) {
	//	Grade math = new Grade ("Mathematics", 77);
	//	System.out.println (math);
	//}
}
