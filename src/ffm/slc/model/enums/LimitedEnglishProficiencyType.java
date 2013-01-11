package ffm.slc.model.enums;

/**
 * An indication that the student has been identified as limited English proficient by the Language Proficiency Assessment Committee (LPAC), or English proficient.
 */
public enum LimitedEnglishProficiencyType {
	NOTLIMITED("NotLimited"),
	LIMITED("Limited"),
	LIMITED_MONITORED_1("Limited Monitored 1"),
	LIMITED_MONITORED_2("Limited Monitored 2");

	private String prettyName;

	LimitedEnglishProficiencyType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
