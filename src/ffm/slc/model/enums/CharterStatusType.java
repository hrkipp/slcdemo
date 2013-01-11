package ffm.slc.model.enums;

/**
 * The category of charter school. For example: School Charter, Open Enrollment Charter
 */
public enum CharterStatusType {
	SCHOOL_CHARTER("School Charter"),
	COLLEGE_UNIVERSITY_CHARTER("College/University Charter"),
	OPEN_ENROLLMENT("Open Enrollment"),
	NOT_A_CHARTER_SCHOOL("Not a Charter School");

	private String prettyName;

	CharterStatusType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
