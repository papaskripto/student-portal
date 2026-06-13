import java.util.HashMap;
import java.util.ArrayList;

// Main class to test the whole thing
public class Main {

	public static void main (String [] args) {
		
		GradeEngine ge = new GradeEngine ();

		Student ada = new Student ("Ada Lovelace", "ADMN1");
		Student jane = new Student ("Jane Doe", "ADMN2");

		ge.CreateStudent (ada);
		ge.CreateStudent (jane);

		ge.addGrade (ada, new Grade ("Math", 78));
		ge.addGrade (jane, new Grade ("Jane", 34));

		System.out.println (
				"Ada's average: " +
				ge.average (ada)
				);

		Student top = ge.findTopStudent ();

		Student bot = ge.findBottomStudent ();

		System.out.println (
				"Top student: " +
				top.getName ()
				);

		System.out.println (
				"Bottom student: " +
				bot.getName ()
				);
	}
}
