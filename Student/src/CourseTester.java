//*****************************************************************************************************
// CourseTester.java		Author: Prakash Acharya
//
// Tests the creation of Course objects using Builder Pattern.
//*****************************************************************************************************
import java.util.ArrayList;

public class CourseTester {
	
	public static void main(String[] args) {
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		// M3 USING BUILDER 
		Course course1 = new Course.CourseBuilder("Fundamentals of Java", "30282")
				.bookRequired("Java Software Solutions")
				.bookAuthor("John Lewis")
				.instructorName("Constance Conner")
				.type(Course.Type.MAJOR.toString())
				.build();
		courses.add(course1);
		
		Course course2 = new Course.CourseBuilder("Data Structures and Algorithm", "73689")
				.bookRequired("Data Structures and Abstractions")
				.bookAuthor("Frank M. Corrano")
				.instructorName("Jessica Masters")
				.type(Course.Type.MAJOR.toString())
				.build();
		courses.add(course2);
		
		for(Course c: courses) {
			System.out.println(c + "\n");
		}
	}
}
