package ffm.slc.model.enums;

/**
 * Previous definition of Ethnicity combining Hispanic/Latino and Race.
 */
public enum OldEthnicityType {
	AMERICAN_INDIAN_OR_ALASKAN_NATIVE("American Indian Or Alaskan Native"),
	ASIAN_OR_PACIFIC_ISLANDER("Asian Or Pacific Islander"),
	BLACK_NOT_OF_HISPANIC_ORIGIN("Black, Not Of Hispanic Origin"),
	HISPANIC("Hispanic"),
	WHITE_NOT_OF_HISPANIC_ORIGIN("White, Not Of Hispanic Origin");

	private String prettyName;

	OldEthnicityType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
