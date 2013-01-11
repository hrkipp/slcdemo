package ffm.slc.model.enums;

/**
 * The type of academic plan the student is following for graduation.
 */
public enum GraduationPlanType {
	CAREER_AND_TECHNICAL_EDUCATION("Career and Technical Education"),
	DISTINGUISHED("Distinguished"),
	MINIMUM("Minimum"),
	RECOMMENDED("Recommended"),
	STANDARD("Standard");

	private String prettyName;

	GraduationPlanType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
