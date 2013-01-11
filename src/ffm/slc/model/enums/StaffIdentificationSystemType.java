package ffm.slc.model.enums;

/**
 * A coding scheme that is used for identification and record-keeping purposes by schools, social services, or other agencies to refer to a staff member.
 */
public enum StaffIdentificationSystemType {
	DRIVERS_LICENSE("Drivers License"),
	HEALTH_RECORD("Health Record"),
	MEDICAID("Medicaid"),
	PROFESSIONAL_CERTIFICATE("Professional Certificate"),
	SCHOOL("School"),
	DISTRICT("District"),
	STATE("State"),
	FEDERAL("Federal"),
	OTHER_FEDERAL("Other Federal"),
	SELECTIVE_SERVICE("Selective Service"),
	SSN("SSN"),
	US_VISA("US Visa"),
	PIN("PIN"),
	CANADIAN_SIN("Canadian SIN"),
	OTHER("Other");

	private String prettyName;

	StaffIdentificationSystemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
