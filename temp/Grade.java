public class Grade {

	private String subject;
	private int score;

	public Grade (String subject) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject () {
		return this.subject;
	}

	public void setSubject (String subject) {
		this.subject = subject;
	}

	public String getScore () {
		return this.score;
	}

	public void setScore (int score) {
		this.score = score;
	}

	public String toString () {
		return this.sbject + ": " + this.score;
	}
}
