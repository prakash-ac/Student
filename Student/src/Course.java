//*******************************************************
// Course.java		Author: Prakash Acharya 
//
// Demonstrates the use of Builder Pattern
//*******************************************************

public class Course {
	
	// Declare enum for course type: major or GE
	public enum Type{
		
		GE("General Education"), MAJOR("Major");
		String description;
		private Type(String description) {
			this.description = description;
		}
		// returns string for an instance of the enum Type
		@Override
		public String toString(){
			return description;
		}
	}
	
	// Course instance variables
	private String name, instructorName, number, bookRequired, bookAuthor, type;
	
	// Because we are using CourseBuilder class, constructor is set to 
	// allow users create course objects through CourseBuilder only.
	// The constructor will take the instance of CourseBuilder class.
	private Course(CourseBuilder builder) {
		this.name = builder.name;
		this.number = builder.number;
		this.bookRequired = builder.bookRequired;
		this.type = builder.type;
		this.bookAuthor = builder.bookAuthor;
		this.instructorName = builder.instructorName;
	}

	
	public static class CourseBuilder{
		private String name, number;
		private String bookRequired = "", type = "", instructorName = "", bookAuthor = "";
		
		public CourseBuilder(String name, String number) {
			this.name = name;
			this.number = number;
		}
		
		public CourseBuilder bookRequired(String var) {
			this.bookRequired = var;
			return this;
		}
		
		public CourseBuilder instructorName(String var) {
			this.instructorName = var;
			return this;
		}
		
		public CourseBuilder type(String var) {
			this.type = var;
			return this;
		}
		
		public CourseBuilder bookAuthor(String var) {
			this.bookAuthor = var;
			return this;
		}
		
		public Course build() {
			return new Course(this);
		}
	}
	
	@Override
	public String toString() {
		String c = "Course Name: " + name + 
				"\nCourse Number: " + number;
		
		if(!instructorName.isEmpty()) {
			c += "\nInstructor Name: " + instructorName;
		}
		
		if(!bookRequired.isEmpty()) {
			c += "\nRequired Book: " + bookRequired;
		}
		
		if(!bookRequired.isEmpty()) {
			c += "\nBook Author: " + bookAuthor;
		}
		
		if(!type.isEmpty()) {
			c += "\nCourse Type: " + type;
		}
		
		return c;
	}
	
}
