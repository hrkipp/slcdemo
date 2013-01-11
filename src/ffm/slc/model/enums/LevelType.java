package ffm.slc.model.enums;

/**
 * The grade level(s) certified for teaching.
 */
public enum LevelType {
	ALL_LEVEL_GRADE_LEVEL_PK_12_("All Level (Grade Level PK-12)"),
	ALL_LEVEL_GRADE_LEVEL_EC_12_("All-Level (Grade Level EC-12)"),
	EARLY_CHILDHOOD_PK_K_("Early Childhood (PK-K)"),
	ELEMENTARY_GRADE_LEVEL_1_6_("Elementary (Grade Level 1-6)"),
	ELEMENTARY_GRADE_LEVEL_1_8_("Elementary (Grade Level 1-8)"),
	ELEMENTARY_GRADE_LEVEL_4_8_("Elementary (Grade Level 4-8)"),
	ELEMENTARY_GRADE_LEVEL_EC_4_("Elementary (Grade Level EC-4)"),
	ELEMENTARY_GRADE_LEVEL_EC_6_("Elementary (Grade Level EC-6)"),
	ELEMENTARY_GRADE_LEVEL_PK_5_("Elementary (Grade Level PK-5)"),
	ELEMENTARY_GRADE_LEVEL_PK_6_("Elementary (Grade Level PK-6)"),
	GRADE_LEVEL_NA("Grade Level NA"),
	JUNIOR_HIGH_GRADE_LEVEL_6_8_("Junior High (Grade Level 6-8)"),
	SECONDARY_GRADE_LEVEL_6_12_("Secondary (Grade Level 6-12)"),
	SECONDARY_GRADE_LEVEL_8_12_("Secondary (Grade Level 8-12)");

	private String prettyName;

	LevelType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
