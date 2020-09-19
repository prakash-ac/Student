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
			new InternationalStudent(isDemo, major, "Undergraduate", 12, "Demo Country");
			
			i++;
			
		}
		
		// Create a Resident Student with same name as "Demo Resident2"
		// Since two Resident Students will have same names, sort will be based on their id's.
		new ResidentStudent("Demo Resident2", "Microbiology", "Undergraduate", 9, true);
		
		// An ArrayList that holds all student objects
		ArrayList<Student> allStudents = Student.getAllStudents();
		
		// M3 Using Comparator
		//Sort all student objects based on the name, if two names are equal perform sort on id
		Collections.sort(allStudents, ORDER_BY_NAME);
		
		// Display each student, and call class specific methods
		
		System.out.println("******** Sorted By Name ********");
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
		
		// M3 Using Comparator
		Collections.sort(allStudents, ORDER_BY_MAJOR);
		
		// Display each student, and call class specific methods
		
		System.out.println("******** Sorted By Major ********");
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
		
	}

}