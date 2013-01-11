package ffm.slc.model.enums;

/**
 * An indication of whether the reported GPA is weighted or unweighted.
 */
public enum GPAWeightedType {
	UNWEIGHTED("Unweighted"),
	WEIGHTED("Weighted");

	private String prettyName;

	GPAWeightedType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
