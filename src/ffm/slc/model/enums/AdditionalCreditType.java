package ffm.slc.model.enums;

/**
 * The type of additional credits or units of value awarded for the completion of a course.
 */
public enum AdditionalCreditType {
	AP("AP"),
	DUAL_CREDIT("Dual credit"),
	IB("IB"),
	OTHER("Other"),
	VOCATIONAL("Vocational");

	private String prettyName;

	AdditionalCreditType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
