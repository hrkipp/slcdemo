package ffm.slc.model.enums;

/**
 * The type of education plan(s) the student is following, if appropriate. For example: Special education Vocational
 */
public enum EducationalPlanItemType {
	_504_PLAN("504 Plan"),
	CAREER_PATHWAYS("Career Pathways"),
	CAREER_SUGGESTIONS("Career Suggestions"),
	COMPLETION_AND_REACH_AGE_22("Completion and Reach Age 22"),
	FULL_TIME_EMPLOYMENT("Full Time Employment"),
	EMPLOYABILITY_SKILLS("Employability Skills"),
	HIGH_SCHOOL_EDUCATION_PLAN("High School Education Plan"),
	IDEA_IEP("IDEA IEP"),
	OUTSIDE_SERVICE_ACCESS("Outside Service Access"),
	PERSONAL_GRADUATION_PLAN("Personal Graduation Plan"),
	STUDENT_SUCCESS_PLAN("Student Success Plan");

	private String prettyName;

	EducationalPlanItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
