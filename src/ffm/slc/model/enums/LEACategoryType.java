package ffm.slc.model.enums;

/**
 * The category of LEA/district. For example: Independent or Charter
 */
public enum LEACategoryType {
	INDEPENDENT("Independent"),
	CHARTER("Charter");

	private String prettyName;

	LEACategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
