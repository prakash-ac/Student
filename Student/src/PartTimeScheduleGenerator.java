//**************************************************************************
// PartTimeScheduleGenerator.java		Author: Prakash Acharya
//
// This class implements ScheduleGenerator interface. 
//
// Generates schedule for part-time Resident or Non-Resident students
//**************************************************************************

public class PartTimeScheduleGenerator implements ScheduleGenerator {
	@Override
	public String generateSchedule() {
		String schedule = "\nMonday:\t\t 09:00 - 15:00" +
				"\nTuesday:\t 09:00 - 15:00" +
				"\nWednesday:\t 09:00 - 15:00";
		return schedule;				
	}
}
