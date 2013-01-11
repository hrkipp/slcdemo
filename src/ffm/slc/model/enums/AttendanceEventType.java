package ffm.slc.model.enums;

/**
 * A code describing the type of the attendance event (e.g., daily attendance, section attendance, etc.)
 */
public enum AttendanceEventType {
	DAILY_ATTENDANCE("Daily Attendance"),
	SECTION_ATTENDANCE("Section Attendance"),
	PROGRAM_ATTENDANCE("Program Attendance"),
	EXTRACURRICULAR_ATTENDANCE("Extracurricular Attendance");

	private String prettyName;

	AttendanceEventType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
