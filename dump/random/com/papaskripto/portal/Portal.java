import java.util.HashMap;

public class Portal {

	public static void main (String [] args) {

		HashMap<String, HashMap<String, Integer>> portalBook = new HashMap<>();

		addStudent (portalBook, "John Doe");
		addStudent (portalBook, "Jane Doe");

		addGrade (portalBook, "John Doe", "Chem", 30);
		addGrade (portalBook, "Jane Doe", "Bio", 40);
		addGrade (portalBook, "Jane Doe", "Math", 32);
		addGrade (portalBook, "John Doe", "Math", 40);

		double av = average (portalBook, "John Doe");
		double av1 = average (portalBook, "Jane Doe");

		System.out.println ("John Doe's average score is " + av);
		System.out.println ("Jane Doe's average score is " + av1);


		System.out.println (portalBook);

		System.out.println ("Top Student: " + findTopStudent (portalBook));
	}

	public static void addStudent (HashMap<String, HashMap<String, Integer>> portalBook, String name) {
		portalBook.put (name, new HashMap<>());
	}

	public static void addGrade (HashMap<String, HashMap<String, Integer>> portalBook, String student, String subject, int score) {
		portalBook.get (student).put (subject, score);
	}

	public static double average (HashMap<String, HashMap<String, Integer>> portalBook, String student) {
		HashMap<String, Integer> subjects = portalBook.get (student);

		int sum = 0;

		for (int grade : subjects.values ()) {
			sum += grade;
		}

		return (double) sum / subjects.size ();
	}

	public static String findTopStudent (HashMap<String, HashMap<String, Integer>> portalBook) {
		String topStudent = "";
		double highestAverage = 0;
		for (String student : portalBook.keySet ()) {
			double av = average (portalBook, student);
			if (av > highestAverage) {
				highestAverage = av;
				topStudent = student;
			}
		}
		return topStudent;
	}
}
