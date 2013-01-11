package ffm.slc.model.enums;

/**
 * Indication of whether the position was filled or retired without filling.
 */
public enum PostingResultType {
	POSITION_FILLED("Position Filled"),
	POSTING_CANCELLED("Posting Cancelled");

	private String prettyName;

	PostingResultType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
