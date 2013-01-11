package ffm.slc.model.enums;

/**
 * A system that is used to identify the organization of subject matter and related learning experiences provided for the instruction of students. In addition to identifying courses using the appropriate state codes, it is encouraged that courses are also cross referenced against one of the national course codes.
 */
public enum CourseCodeSystemType {
	CSSC_COURSE_CODE("CSSC course code"),
	INTERMEDIATE_AGENCY_COURSE_CODE("Intermediate agency course code"),
	LEA_COURSE_CODE("LEA course code"),
	NCES_PILOT_SNCCS_COURSE_CODE("NCES Pilot SNCCS course code"),
	OTHER("Other"),
	SCED_COURSE_CODE("SCED course code"),
	SCHOOL_COURSE_CODE("School course code"),
	STATE_COURSE_CODE("State course code"),
	UNIVERSITY_COURSE_CODE("University course code");

	private String prettyName;

	CourseCodeSystemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
