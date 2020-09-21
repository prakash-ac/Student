
//**********************************************************************
// StudentFactory.java		Author: Prakash Acharya
//
// Demonstrates the creation of objects from a factory class.
//**********************************************************************
public class StudentFactory {
	
	//
	public static Student newStudent(String type, String name, String major, 
			String degree, String countryApplyingFrom) {
		
		Student s;
		if(countryApplyingFrom == null) {
			if(type.equalsIgnoreCase("Resident")) {
				s = new ResidentStudent(name, major, degree);
			} else if(type.equalsIgnoreCase("Non-Resident")) {
				s = new NonResidentStudent(name, major, degree);
			} else 
				s = null;
		} else {
			if (type.equalsIgnoreCase("International")) {
				s = new InternationalStudent(name, major, degree, countryApplyingFrom);
			} else
				s = null;
		}
		
		return s;
	}
	


}
