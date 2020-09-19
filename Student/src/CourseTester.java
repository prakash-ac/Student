import java.util.ArrayList;

public class CourseTester {
	
	public static void main(String[] args) {
		
		ArrayList<Course> courses = new ArrayList<Course>();
		Course course1 = new Course.CourseBuilder("Fundamentals of Java", "CS111B")
				.bookRequired("Java Software Solutions")
				.bookAuthor("John Lewis")
				.instructorName("Constance Conner")
				.type(Course.Type.MAJOR.toString())
				.build();
		courses.add(course1);
		
		Course course2 = new Course.CourseBuilder("Data Structures and Algorithm", "CS111C")
				.bookRequired("Data Structures and Abstractions")
				.bookAuthor("Frank M. Corrano")
				.instructorName("Jessica Masters")
				.type(Course.Type.MAJOR.toString())
				.build();
		courses.add(course2);
		
		for(Course c: courses) {
			System.out.println(c);
		}
	}
}
