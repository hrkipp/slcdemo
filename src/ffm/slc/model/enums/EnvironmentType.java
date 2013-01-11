package ffm.slc.model.enums;

/**
 * Type of environment a user account could access
 */
public enum EnvironmentType {
	PRODUCTION("Production"),
	SANDBOX("Sandbox");

	private String prettyName;

	EnvironmentType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
