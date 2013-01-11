package ffm.slc.model.enums;

/**
 * Definition: A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a student.
 */
public enum StudentIdentificationSystemType {
	CANADIAN_SIN("Canadian SIN"),
	DISTRICT("District"),
	FAMILY("Family"),
	FEDERAL("Federal"),
	LOCAL("Local"),
	NATIONAL_MIGRANT("National Migrant"),
	OTHER("Other"),
	SCHOOL("School"),
	SSN("SSN"),
	STATE("State"),
	STATE_MIGRANT("State Migrant");

	private String prettyName;

	StudentIdentificationSystemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
