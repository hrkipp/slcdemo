package ffm.slc.model.enums;

/**
 * The type of education institution as classified by its primary focus.
 */
public enum SchoolType {
	ALTERNATIVE("Alternative"),
	REGULAR("Regular"),
	SPECIAL_EDUCATION("Special Education"),
	VOCATIONAL("Vocational"),
	JJAEP("JJAEP"),
	DAEP("DAEP");

	private String prettyName;

	SchoolType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
