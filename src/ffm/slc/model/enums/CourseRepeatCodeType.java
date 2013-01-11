package ffm.slc.model.enums;

/**
 * Indicates that an academic course has been repeated by a student and how that repeat is to be computed in the student's academic grade average.
 */
public enum CourseRepeatCodeType {
	REPEATCOUNTED("RepeatCounted"),
	REPEATNOTCOUNTED("RepeatNotCounted"),
	REPLACEMENTCOUNTED("ReplacementCounted"),
	REPLACEDNOTCOUNTED("ReplacedNotCounted"),
	REPEATOTHERINSTITUTION("RepeatOtherInstitution"),
	NOTCOUNTEDOTHER("NotCountedOther");

	private String prettyName;

	CourseRepeatCodeType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
