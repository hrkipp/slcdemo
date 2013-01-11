package ffm.slc.model.enums;

/**
 * The secondary course's level of rigor.
 */
public enum CourseLevelType {
	BASIC_OR_REMEDIAL("Basic or remedial"),
	ENRICHED_OR_ADVANCED("Enriched or advanced"),
	GENERAL_OR_REGULAR("General or regular"),
	HONORS("Honors");

	private String prettyName;

	CourseLevelType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
