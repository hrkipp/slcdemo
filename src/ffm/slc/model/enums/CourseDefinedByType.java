package ffm.slc.model.enums;

/**
 * Specifies whether the course was defined by the SEA, LEA, School, or national organization.
 */
public enum CourseDefinedByType {
	LEA("LEA"),
	NATIONAL_ORGANIZATION("National Organization"),
	SEA("SEA"),
	SCHOOL("School");

	private String prettyName;

	CourseDefinedByType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
