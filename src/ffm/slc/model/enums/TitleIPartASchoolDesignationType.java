package ffm.slc.model.enums;

/**
 * Denotes the Title I Part A designation for the school.
 */
public enum TitleIPartASchoolDesignationType {
	NOT_DESIGNATED_AS_A_TITLE_I_PART_A_SCHOOL("Not designated as a Title I Part A school"),
	TITLE_I_PART_A_SCHOOLWIDE_ASSISTANCE_PROGRAM_SCHOOL("Title I Part A Schoolwide Assistance Program School"),
	TITLE_I_PART_A_TARGETED_ASSISTANCE_SCHOOL("Title I Part A Targeted Assistance School"),
	TITLE_I_TARGETED_ELIGIBLE_SCHOOL_NO_PROGRAM("Title I targeted eligible school - no program"),
	TITLE_I_TARGETED_SCHOOL("Title I targeted school"),
	TITLE_I_SCHOOL_WIDE_ELIGIBLE_TITLE_I_TARGETED_PROGRAM("Title I school wide eligible - Title I targeted program"),
	TITLE_I_SCHOOL_WIDE_ELIGIBLE_SCHOOL_NO_PROGRAM("Title I school wide eligible school - no program");

	private String prettyName;

	TitleIPartASchoolDesignationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
