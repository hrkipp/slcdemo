package ffm.slc.model.enums;

/**
 * The formal name of the program of instruction, training, services or benefits available through federal, state, or local agencies.
 */
public enum ProgramType {
	ADULT_CONTINUING_EDUCATION("Adult/Continuing Education"),
	ALTERNATIVE_EDUCATION("Alternative Education"),
	ATHLETICS("Athletics"),
	BILINGUAL("Bilingual"),
	BILINGUAL_SUMMER("Bilingual Summer"),
	CAREER_AND_TECHNICAL_EDUCATION("Career and Technical Education"),
	COCURRICULAR_PROGRAMS("Cocurricular Programs"),
	COLLEGE_PREPARATORY("College Preparatory"),
	COMMUNITY_SERVICE_PROGRAM("Community Service Program"),
	COMMUNITY_JUNIOR_COLLEGE_EDUCATION_PROGRAM("Community/Junior College Education Program"),
	COMPENSATORY_SERVICES_FOR_DISADVANTAGED_STUDENTS("Compensatory Services for Disadvantaged Students"),
	COUNSELING_SERVICES("Counseling Services"),
	ENGLISH_AS_A_SECOND_LANGUAGE_ESL_("English as a Second Language (ESL)"),
	EVEN_START("Even Start"),
	EXTENDED_DAY_CHILD_CARE_SERVICES("Extended Day/Child Care Services"),
	GIFTED_AND_TALENTED("Gifted and Talented"),
	HEAD_START("Head Start"),
	HEALTH_SERVICES_PROGRAM("Health Services Program"),
	HIGH_SCHOOL_EQUIVALENCY_PROGRAM_HSEP_("High School Equivalency Program (HSEP)"),
	IDEA("IDEA"),
	IMMIGRANT_EDUCATION("Immigrant Education"),
	INDIAN_EDUCATION("Indian Education"),
	INTERNATIONAL_BACCALAUREATE("International Baccalaureate"),
	LIBRARY_MEDIA_SERVICES_PROGRAM("Library/Media Services Program"),
	MAGNET_SPECIAL_PROGRAM_EMPHASIS("Magnet/Special Program Emphasis"),
	MIGRANT_EDUCATION("Migrant Education"),
	NEGLECTED_AND_DELINQUENT_PROGRAM("Neglected and Delinquent Program"),
	OPTIONAL_FLEXIBLE_SCHOOL_DAY_PROGRAM_OFSDP_("Optional Flexible School Day Program (OFSDP)"),
	OTHER("Other"),
	REGULAR_EDUCATION("Regular Education"),
	REMEDIAL_EDUCATION("Remedial Education"),
	SECTION_504_PLACEMENT("Section 504 Placement"),
	SERVICE_LEARNING("Service Learning"),
	SPECIAL_EDUCATION("Special Education"),
	STUDENT_RETENTION_DROPOUT_PREVENTION("Student Retention/Dropout Prevention"),
	SUBSTANCE_ABUSE_EDUCATION_PREVENTION("Substance Abuse Education/Prevention"),
	TEACHER_PROFESSIONAL_DEVELOPMENT_MENTORING("Teacher Professional Development/Mentoring"),
	TECHNICAL_PREPARATORY("Technical Preparatory"),
	TITLE_I_PART_A("Title I Part A"),
	VOCATIONAL_EDUCATION("Vocational Education");

	private String prettyName;

	ProgramType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
