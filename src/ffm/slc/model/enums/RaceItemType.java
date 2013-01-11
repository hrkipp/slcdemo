package ffm.slc.model.enums;

/**
 * The enumeration items defining the racial categories which most clearly reflects the individual's recognition of his or her community or with which the individual most identifies.
 */
public enum RaceItemType {
	AMERICAN_INDIAN_ALASKAN_NATIVE("American Indian - Alaskan Native"),
	ASIAN("Asian"),
	BLACK_AFRICAN_AMERICAN("Black - African American"),
	NATIVE_HAWAIIAN_PACIFIC_ISLANDER("Native Hawaiian - Pacific Islander"),
	WHITE("White");

	private String prettyName;

	RaceItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
