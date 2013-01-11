package ffm.slc.model.enums;

/**
 * The classification of the education agency within the geographic boundaries of a state according to the level of administrative and operational control granted by the state.
 */
public enum EducationOrganizationCategoryType {
	STATE_EDUCATION_AGENCY("State Education Agency"),
	EDUCATION_SERVICE_CENTER("Education Service Center"),
	LOCAL_EDUCATION_AGENCY("Local Education Agency"),
	SCHOOL("School");

	private String prettyName;

	EducationOrganizationCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
