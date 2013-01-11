package ffm.slc.model.enums;

/**
 * An indication as to whether an assessment conforms to a standard. For example: Local standard Statewide standard Regional standard Association standard School standard ...
 */
public enum ContentStandardType {
	NATIONAL_STANDARD("National Standard"),
	STATE_STANDARD("State Standard"),
	COLLEGE_ENTRANCE_STANDARD("College Entrance Standard"),
	LEA_STANDARD("LEA Standard"),
	TEXAS_ESSENTIAL_KNOWLEDGE_AND_SKILLS("Texas Essential Knowledge and Skills"),
	SAT("SAT"),
	PSAT("PSAT"),
	ACT("ACT"),
	ADVANCED_PLACEMENT("Advanced Placement"),
	INTERNATIONAL_BACCALAUREATE("International Baccalaureate");

	private String prettyName;

	ContentStandardType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
