package ffm.slc.model.enums;

/**
 * The type of communication number listed for an organization.
 */
public enum InstitutionTelephoneNumberType {
	MAIN("Main"),
	ADMINISTRATIVE("Administrative"),
	HEALTHCLINIC("HealthClinic"),
	ATTENDANCE("Attendance"),
	OTHER("Other"),
	FAX("Fax");

	private String prettyName;

	InstitutionTelephoneNumberType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
