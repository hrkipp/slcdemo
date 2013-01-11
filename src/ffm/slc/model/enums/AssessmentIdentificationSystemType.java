package ffm.slc.model.enums;

/**
 * A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to an assessment.
 */
public enum AssessmentIdentificationSystemType {
	SCHOOL("School"),
	DISTRICT("District"),
	STATE("State"),
	FEDERAL("Federal"),
	OTHER_FEDERAL("Other Federal"),
	TEST_CONTRACTOR("Test Contractor"),
	OTHER("Other");

	private String prettyName;

	AssessmentIdentificationSystemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
