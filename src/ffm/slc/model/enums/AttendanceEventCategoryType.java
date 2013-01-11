package ffm.slc.model.enums;

/**
 * A code categorizing the attendance event (e.g., excused absence, unexcused absence)
 */
public enum AttendanceEventCategoryType {
	IN_ATTENDANCE("In Attendance"),
	EXCUSED_ABSENCE("Excused Absence"),
	UNEXCUSED_ABSENCE("Unexcused Absence"),
	TARDY("Tardy"),
	EARLY_DEPARTURE("Early departure");

	private String prettyName;

	AttendanceEventCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
