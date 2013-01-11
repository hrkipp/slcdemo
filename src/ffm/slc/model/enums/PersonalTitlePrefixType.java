package ffm.slc.model.enums;

/**
 * A prefix used to denote the title, degree, position or seniority of the person.
 */
public enum PersonalTitlePrefixType {
	COLONEL("Colonel"),
	DR("Dr"),
	MR("Mr"),
	MRS("Mrs"),
	MS("Ms"),
	REVEREND("Reverend"),
	SR("Sr"),
	SISTER("Sister");

	private String prettyName;

	PersonalTitlePrefixType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
