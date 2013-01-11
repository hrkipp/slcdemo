package ffm.slc.model.enums;

/**
 * The type of grade in a report card or transcript (e.g., Final, Exam, Grading Period, ...)
 */
public enum GradeType {
	CONDUCT("Conduct"),
	EXAM("Exam"),
	FINAL("Final"),
	GRADING_PERIOD("Grading Period"),
	MID_TERM_GRADE("Mid-Term Grade"),
	PROGRESS_REPORT("Progress Report"),
	SEMESTER("Semester");

	private String prettyName;

	GradeType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
