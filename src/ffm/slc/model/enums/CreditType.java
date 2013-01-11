package ffm.slc.model.enums;

/**
 * The type of credits or units of value awarded for the completion of a course.
 */
public enum CreditType {
	CARNEGIE_UNIT("Carnegie unit"),
	SEMESTER_HOUR_CREDIT("Semester hour credit"),
	TRIMESTER_HOUR_CREDIT("Trimester hour credit"),
	QUARTER_HOUR_CREDIT("Quarter hour credit"),
	NINE_MONTH_YEAR_HOUR_CREDIT("Nine month year hour credit"),
	TWELVE_MONTH_YEAR_HOUR_CREDIT("Twelve month year hour credit"),
	OTHER("Other");

	private String prettyName;

	CreditType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
