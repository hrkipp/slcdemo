package ffm.slc.model.enums;

/**
 * The type of education institution as classified by its funding source.
 */
public enum AdministrativeFundingControlType {
	PUBLIC_SCHOOL("Public School"),
	PRIVATE_SCHOOL("Private School"),
	OTHER("Other");

	private String prettyName;

	AdministrativeFundingControlType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
