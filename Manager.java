public class Manager {

	private HashMap<String, List<Integer>> sgrades;

	public Manager () {
		this.sgrades = new HashMap<>();
	}

	// Add student/
	public void addStudent (Student student) {
		sgrades.put (student);
	}
	// Add grades
	public void addGrade (Grade grade) {
		sgrades.put (grade);
	}
	// Calculate average
	public int average (ArrayList<Integer> grades) {
		int sum = 0;
		int numOfGrades = 0;
		for (Integer grade : grades) {
			sum += grade;
			numOfGrades += 1;
		}
		int av = sum / numOfGrades;
		return av;
	}
	// Find top student
	ArrayList<Integer> studentavs = new ArrayList<>();

	public int topStudent (ArrayList<Integer> studentavs) {
		int top = 0;
		for (Integer studentav : studentavs) {
			if (studentav > top) {
				studentav = top;
			}
		}
		return top;
	}
	// Find bottom student
	public int bottomStudent (ArrayList<Integer> studentavs) {
		int bottom = 0;
		for (Integer studentav : studentavs) {
			if (studentav < bottom) {
				studentav = bottom;
			}
		}
		return bottom;
	}
}
