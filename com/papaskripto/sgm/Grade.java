public class Grade {

	HashMap<String, Integer> grade;

	public Grade (HashMap<String, Integer> grade) {
		this.grade = new HashMap<>();
	}

	private String getGrade () {
		return this.grade;
	}

	private void setGrade (HashMap<String, Integer> newGrade) {
		this.grade = newGrade;
	}

	public String toString () {
		return this.subject + ": " + this.score;
	}
}
