import java.util.*;
import java.text.DecimalFormat;

//*******************************************************
// StudentDriver.java		Author: Prakash Acharya
//
// To test the Student and its sub-classes
//*******************************************************

public class StudentDriver {
	
	
	//***** Comparator instances*****
	public final static Comparator<Student> ORDER_BY_NAME = new Student.StudentNameComparator();
	public final static Comparator<Student> ORDER_BY_ID = new Student.StudentIdComparator();
	public final static Comparator<Student> ORDER_BY_MAJOR = new Student.StudentMajorComparator();
	public final static Comparator<Student> ORDER_BY_DEGREE= new Student.StudentDegreeComparator();
	public final static Comparator<Student> ORDER_BY_TOTAL_UNITS_ENROLLED = new Student.StudentTotalUnitsComparator();
	

	public static void main(String[] args) {
		
		// List of majors
	    ArrayList<String> majors = new ArrayList<String>( 
	               Arrays.asList("Microbiology", 
	                             "Accounting", 
	                             "Computer Science",
	                             "Poetry"));
	    DecimalFormat df = new DecimalFormat("0.00");
	    
		
		// Create 3 Resident, 3 Non-Resident, and 3 International students
		int i = 0;
		for(String major: majors) {
			String rsDemo = "Demo Resident" + i;
			new ResidentStudent(rsDemo, major, "Graduate", 12, true);
			
			String nrsDemo = "Demo Non-Resident" + i;
			new NonResidentStudent(nrsDemo, major, "Graduate", 10, true);
			
			String isDemo = "Demo International" + i;
			new InternationalStudent(isDemo, major, "Undergraduate", 8, "Demo Country");
			
			i++;
			
		}

		
		// An ArrayList that holds all student objects
		ArrayList<Student> allStudents = Student.getAllStudents();
		
		// M3 USING COMPARATOR
		//Sort all student objects based on the name
		Collections.sort(allStudents, ORDER_BY_NAME);
		
		System.out.println("******** Sorted By Name ********\n");
		// It was not necessary to downcast Student class object to specific child class object
		// because no child class specific methods are invoked here. 
		// However, I just did not want to remove the example of down casting for future reference.
		for(Student s: allStudents) {
			if(s instanceof ResidentStudent) {
				if(s instanceof NonResidentStudent) {
					NonResidentStudent nrs = (NonResidentStudent) s;
					System.out.println(nrs);
				}
				else {
					ResidentStudent rs = (ResidentStudent) s;
					System.out.println(rs);
					} 
				} 
			else if(s instanceof InternationalStudent) {
				InternationalStudent is = (InternationalStudent) s;
				System.out.println(is);
			}
			System.out.println();
		}
		
		// M3 USING COMPARATOR
		// sort students based on their major
		Collections.sort(allStudents, ORDER_BY_MAJOR);
		
		System.out.println("******** Sorted By Major ********\n");
		for(Student s: allStudents) {
			if(s instanceof ResidentStudent) {
				if(s instanceof NonResidentStudent) {
					NonResidentStudent nrs = (NonResidentStudent) s;
					System.out.println(nrs);
				}
				else {
					ResidentStudent rs = (ResidentStudent) s;
					System.out.println(rs);
					} 
				} 
			else if(s instanceof InternationalStudent) {
				InternationalStudent is = (InternationalStudent) s;
				System.out.println(is);
			}
			
			System.out.println();
		}
		
		// M3 USING STRATEGY
		// invoke generateSchedule() based on their full-time or part-time status
		System.out.println("******** Using Strategy Pattern ********");
		for(Student s: allStudents) {
			System.out.println("\nStudent Name: " + s.getName());
			s.generateSchedule();
		}
	}

}