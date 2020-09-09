
//*******************************************************
// Student.java		Author: Prakash Acharya
//
// This is an abstract class. 
//
// Defines a general student object.
//*******************************************************

public abstract class Student {
	private int id;
	private String name, major, faculty;
	private int numOfUnitsEnrolled;
	protected static final int maxUnitsAllowed = 18;
	
	public static int count = 0;
	public static final int START_ID = 100000;
	public static final double PER_UNIT_COST = 576.0;
	public static final int DEFAULT_NUM_UNITS_ENROLLED = 0;
	
	
	// this constructor is invoked when all the parameters are provided
	// student id starts from 100000, and is incremented by 1 for each new student
	public Student(String name, String major, String faculty, 
			int numOfUnitsEnrolled) {
		this.id = START_ID + count;
		this.name = name;
		this.major = major;
		this.faculty = faculty;
		this.numOfUnitsEnrolled = numOfUnitsEnrolled;
		count++;
		
	}
	
	
	// this constructor will be invoked if no id and number number of units enrolled is provided
	public Student(String name, String major, String faculty) {
		this(name, major, faculty, DEFAULT_NUM_UNITS_ENROLLED);
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getId() {
		return id;
	}

	public int getNumOfUnitsEnrolled() {
		return numOfUnitsEnrolled;
	}

	public void setNumOfUnitsEnrolled(int numOfUnitsEnrolled) {
		if(numOfUnitsEnrolled > 0 && numOfUnitsEnrolled < 18)
			this.numOfUnitsEnrolled = numOfUnitsEnrolled;
	}
	
	
	@Override
	public String toString() {
		String student = "Name: " + getName() + "\nStudent Id: " + id + "\nMajor: " + getMajor();
		student += "\nFaculty: " + getFaculty() + "\nNumber of Units Enrolled: " + getNumOfUnitsEnrolled();
		return student;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student univStu = (Student) obj;
			return id==univStu.id && name.equalsIgnoreCase(univStu.name) && 
					faculty.equals(univStu.faculty) && major.equals(univStu.major);
		}else {
			return false;
		}
	}
	
	// Generate total tuition cost to pay for a student
	// To be implemented by child classes
	public abstract String generateTutionCost();

}