package ffm.slc.model.enums;

/**
 * Type of employment separation; for example: Voluntary separation, Involuntary separation, Mutual agreement. Other, etc.
 */
public enum SeparationType {
	VOLUNTARY_SEPARATION("Voluntary separation"),
	INVOLUNTARY_SEPARATION("Involuntary separation"),
	MUTUAL_AGREEMENT("Mutual agreement"),
	OTHER("Other");

	private String prettyName;

	SeparationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
