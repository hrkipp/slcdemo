package ffm.slc.model.enums;

/**
 * The type of students the course was designed for.
 */
public enum PopulationServedType {
	REGULAR_STUDENTS("Regular Students"),
	BILINGUAL_STUDENTS("Bilingual Students"),
	COMPENSATORY_REMEDIAL_EDUCATION_STUDENTS("Compensatory/Remedial Education Students"),
	GIFTED_AND_TALENTED_STUDENTS("Gifted and Talented Students"),
	CAREER_AND_TECHNICAL_EDUCATION_STUDENTS("Career and Technical Education Students"),
	SPECIAL_EDUCATION_STUDENTS("Special Education Students"),
	ESL_STUDENTS("ESL Students"),
	ADULT_BASIC_EDUCATION_STUDENTS("Adult Basic Education Students"),
	HONORS_STUDENTS("Honors Students"),
	MIGRANT_STUDENTS("Migrant Students");

	private String prettyName;

	PopulationServedType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
