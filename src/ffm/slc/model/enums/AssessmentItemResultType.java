package ffm.slc.model.enums;

/**
 * The analyzed result of a student's response to an assessment item.. For example: Correct Incorrect Met standard ...
 */
public enum AssessmentItemResultType {
	CORRECT("Correct"),
	INCORRECT("Incorrect"),
	MET_STANDARD("Met standard");

	private String prettyName;

	AssessmentItemResultType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
