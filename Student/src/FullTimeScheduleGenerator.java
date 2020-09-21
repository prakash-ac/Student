//***********************************************************************************
// FullTimeScheduleGenerator.java		Author: Prakash Acharya
//
// This class implements ScheduleGenerator interface. 
//
// Generates schedule for full-time Resident or Non-Resident students.
// Since all international students are required to be full-time
// InternationalStudent object also will invoke the method in this class by default.
//***********************************************************************************

public class FullTimeScheduleGenerator implements ScheduleGenerator{
	
	@Override 
	public String generateSchedule() {
		String schedule = "\nMonday:\t\t 09:00 - 15:00" +
				"\nTuesday:\t 09:00 - 17:00" +
				"\nWednesday:\t 09:00 - 17:00" +
				"\nThursday:\t 09:00 - 17:00" +
				"\nFriday:\t\t 09:00 - 17:00"; 
				
		return schedule;
	}
}
