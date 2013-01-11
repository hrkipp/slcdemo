package ffm.slc.model.enums;

/**
 * Indicator if the test was retaken. For example: Primary administration First retest Second retest ...
 */
public enum RetestIndicatorType {
	PRIMARY_ADMINISTRATION("Primary Administration"),
	_1ST_RETEST("1st Retest"),
	_2ND_RETEST("2nd Retest");

	private String prettyName;

	RetestIndicatorType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
