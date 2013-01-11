package ffm.slc.model.enums;

/**
 * Information on the type of individual who reported the incident.
 */
public enum ReporterDescriptionType {
	PARENT("Parent"),
	STAFF("Staff"),
	STUDENT("Student"),
	OTHER("Other");

	private String prettyName;

	ReporterDescriptionType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
