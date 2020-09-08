//*******************************************************
// Student.java		Author: Prakash Acharya
//
// This is an abstract class. 
// Defines a general student object.
//*******************************************************

public abstract class Student {
	private String name, major, faculty;
	private int id, numOfUnitsEnrolled;
	public static final int DEFAULT_NUM_UNITS_ENROLLED = 0;
	public static int[] num_students = new int[100];
	public static int index = 0;
	public static int count;
	public static final int DEFUALT_ID = 0;
	protected static final int maxUnitsAllowed = 18;
	protected static final double perUnitCost = 576.0;
	
	// this constructor is invoked when all the parameters are provided
	public Student(String name, int id, String major, String faculty, 
			int numOfUnitsEnrolled) {
		this.name = name;
		this.major = major;
		this.faculty = faculty;
		this.id = id;
		this.numOfUnitsEnrolled = numOfUnitsEnrolled;
		count ++;
		
		
	}
	
	// this constructor will be invoked if no number of units enrolled specified
	public Student(String name, int id, String major, String faculty) {
		this(name,id, major, faculty, DEFAULT_NUM_UNITS_ENROLLED);
	}
	
	// this constructor will be invoked if no id is provided.
	public Student(String name, String major, String faculty,int numOfUnitsEnrolled) {
			this(name, DEFUALT_ID, major, faculty, numOfUnitsEnrolled);
		}
	
	// this constructor will be invoked if no id and number number of units enrolled is provided
	public Student(String name, String major, String faculty) {
		this(name, DEFUALT_ID, major, faculty, DEFAULT_NUM_UNITS_ENROLLED);
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

	public void setId(int id) {
		this.id = id;
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
	
	public abstract String generateTutionCost();
	
	public abstract String generateSchedule();

}