package ffm.slc.model.enums;

/**
 * The enumeration of the different levels of education achievable.
 */
public enum LevelOfEducationType {
	NO_DEGREE("No Degree"),
	BACHELOR_S("Bachelor's"),
	MASTER_S("Master's"),
	DOCTORATE("Doctorate");

	private String prettyName;

	LevelOfEducationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
