package ffm.slc.model.enums;

/**
 * The item for indication of the nature and difficulty of instruction: remedial, basic, honors, Ap, IB, Dual Credit, CTE. etc.
 */
public enum CourseLevelCharacteristicItemType {
	ADVANCED("Advanced"),
	ADVANCED_PLACEMENT("Advanced Placement"),
	CORE_SUBJECT("Core Subject"),
	CORRESPONDENCE("Correspondence"),
	CTE("CTE"),
	DISTANCE_LEARNING("Distance Learning"),
	DUAL_CREDIT("Dual Credit"),
	GRADUATION_CREDIT("Graduation Credit"),
	HONORS("Honors"),
	IB_COURSE("IB Course"),
	MAGNET("Magnet"),
	PRE_AP("Pre-AP"),
	PRE_IB("Pre-IB"),
	REMEDIAL("Remedial"),
	STUDENTS_WITH_DISABILITIES("Students with disabilities"),
	BASIC("Basic"),
	GENERAL("General"),
	GIFTED_AND_TALENTED("Gifted and Talented"),
	COLLEGE_LEVEL("College level"),
	ENGLISH_LANGUAGE_LEARNER("English Language Learner"),
	UNTRACKED("Untracked"),
	ACCEPTED_AS_HIGH_SCHOOL_EQUIVALENT("Accepted as high school equivalent"),
	OTHER("Other");

	private String prettyName;

	CourseLevelCharacteristicItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
