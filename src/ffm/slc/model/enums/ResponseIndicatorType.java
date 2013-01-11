package ffm.slc.model.enums;

/**
 * Indicator of the response. For example: Nonscorable response Ineffective response Effective response Partial response ...
 */
public enum ResponseIndicatorType {
	NONSCORABLE_RESPONSE("Nonscorable response"),
	INEFFECTIVE_RESPONSE("Ineffective response"),
	EFFECTIVE_RESPONSE("Effective response"),
	PARTIAL_RESPONSE("Partial response");

	private String prettyName;

	ResponseIndicatorType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
