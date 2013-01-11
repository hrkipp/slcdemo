package ffm.slc.model.enums;

/**
 * A coding scheme that is used for identification and record-keeping purposes by education organizations, social services, or other agencies to refer to an education organization.
 */
public enum EducationOrgIdentificationSystemType {
	SCHOOL("School"),
	ACT("ACT"),
	LEA("LEA"),
	SEA("SEA"),
	NCES("NCES"),
	FEDERAL("Federal"),
	DUNS("DUNS"),
	OTHER_FEDERAL("Other Federal"),
	OTHER("Other");

	private String prettyName;

	EducationOrgIdentificationSystemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
