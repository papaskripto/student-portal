import com.papaskripto.studentportal.Student;
import com.papaskripto.studentportal.Grade;

import java.util.HashMap;
import java.util.ArrayList;

public class GradeEngine {

	HashMap<Student, ArrayList<Student>> records;

	public GradeEngine () {
		this.records = new HashMap<>();
	}

	// Create student
	public void CreateStudent (Student student) {
		records.put (student, new ArrayList<>());
	}

	// Add grade
	public void addGrade (Grade grade) {
		records.get (student).add (grade);
	}

	// Calculate student average grade
	public double average (Student student) {
		ArrayList<Grade> grades = records.get (student);
		int sum = 0;
		for (Grade grade : grades) {
			sum += grade.getScore ();
		}
		return (double) sum / grades.size ();
	}

	// Find the top student
	public Student findTopStudent () {
		Student topStudent = null;
		double highestAverage = 0;
		for (Student student : records.keySet ()) {
			double av = average (student);
			if (av > highestAverage) {
				highestAverage = av;
				topStudent = student;
			}
		}
		return topStudent;
	}

	// Find the least performing student
	public Student findBottomStudent () {
		Student bottomStudent = null;
		double lowestAverage = Double.MAX_VALUE;
		for (Student student : records.keySet ()) {
			av = average (student);
			if (av < lowestAverage) {
				lowestAverage = av;
				bottomStudent = student;
			}
		}
		return bottomStudent;
	}

	// Remove student
	public void removeStudent (Student student) {
		records.remove (student);
	}
}
