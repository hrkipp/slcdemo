package ffm.slc.model.enums;

/**
 * Defines standard levels of competency or performance that can be used for dashboard visualizations: advanced, proficient, basic, below basic.
 */
public enum PerformanceBaseType {
	ADVANCED("Advanced"),
	PROFICIENT("Proficient"),
	BASIC("Basic"),
	BELOW_BASIC("Below Basic"),
	WELL_BELOW_BASIC("Well Below Basic");

	private String prettyName;

	PerformanceBaseType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
