package ffm.slc.model.enums;

/**
 * The result from the student's attempt to take the course, for example: Pass Fail Incomplete Withdrawn
 */
public enum CourseAttemptResultType {
	PASS("Pass"),
	FAIL("Fail"),
	INCOMPLETE("Incomplete"),
	WITHDRAWN("Withdrawn");

	private String prettyName;

	CourseAttemptResultType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
