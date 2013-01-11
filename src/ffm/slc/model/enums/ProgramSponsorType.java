package ffm.slc.model.enums;

/**
 * Ultimate and intermediate providers of funds for a particular educational or service program or activity or for an individual's participation in the program or activity; e.g., Federal, State, ESC, District, School, Private Org, etc.
 */
public enum ProgramSponsorType {
	FEDERAL("Federal"),
	STATE_EDUCATION_AGENCY("State Education Agency"),
	EDUCATION_SERVICE_CENTER("Education Service Center"),
	LOCAL_EDUCATION_AGENCY("Local Education Agency"),
	SCHOOL("School"),
	PRIVATE_ORGANIZATION("Private Organization");

	private String prettyName;

	ProgramSponsorType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
