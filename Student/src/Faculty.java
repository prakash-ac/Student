//*******************************************************
// Faculty.java		Author: Prakash Acharya
//
// This is an Enum
//
// Declare all faculties the university has
//*******************************************************
public enum Faculty {
	
	SCIENCE_AND_ENGINEERING("School of Science & Engineering"), 
	BUSINESS("School of Business"), 
	SOCIAL_SCIENCES("School of Social Sciences"), 
	ARTS("School of Creative and Liberal Arts"),
	EDUCATION("School of Busness"), 
	HEALTH_SCIENCE("School of Health Science");
	
	private String school;
	
	private Faculty(String school) {
		this.school = school;
	}
	
	public String getSchool() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return school;
	}
}
