package ffm.slc.model.enums;

/**
 * The type of scheduled or unscheduled event for the day. For example: Instructional day Teacher only day Holiday Make-up day Weather day Student late arrival/early dismissal ...
 */
public enum CalendarEventType {
	INSTRUCTIONAL_DAY("Instructional day"),
	TEACHER_ONLY_DAY("Teacher only day"),
	HOLIDAY("Holiday"),
	MAKE_UP_DAY("Make-up day"),
	WEATHER_DAY("Weather day"),
	STUDENT_LATE_ARRIVAL_EARLY_DISMISSAL("Student late arrival/early dismissal"),
	EMERGENCY_DAY("Emergency day"),
	STRIKE("Strike"),
	OTHER("Other");

	private String prettyName;

	CalendarEventType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
