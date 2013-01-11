package ffm.slc.model.enums;

/**
 * The environment in which the test was administered. For example: Electronic Classroom Testing Center ...
 */
public enum AdministrationEnvironmentType {
	CLASSROOM("Classroom"),
	SCHOOL("School"),
	TESTING_CENTER("Testing Center");

	private String prettyName;

	AdministrationEnvironmentType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
