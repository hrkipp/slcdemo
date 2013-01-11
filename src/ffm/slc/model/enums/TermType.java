package ffm.slc.model.enums;

/**
 * The type of the session during the school year (e.g., Fall Semester).
 */
public enum TermType {
	FALL_SEMESTER("Fall Semester"),
	SPRING_SEMESTER("Spring Semester"),
	SUMMER_SEMESTER("Summer Semester"),
	FIRST_TRIMESTER("First Trimester"),
	SECOND_TRIMESTER("Second Trimester"),
	THIRD_TRIMESTER("Third Trimester"),
	YEAR_ROUND("Year Round"),
	MINITERM("MiniTerm");

	private String prettyName;

	TermType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
