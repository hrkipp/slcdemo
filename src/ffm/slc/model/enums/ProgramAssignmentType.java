package ffm.slc.model.enums;

/**
 * The name of the education program for which a teacher is assigned to a school.
 */
public enum ProgramAssignmentType {
	REGULAR_EDUCATION("Regular Education"),
	TITLE_I_ACADEMIC("Title I-Academic"),
	TITLE_I_NON_ACADEMIC("Title I-Non-Academic"),
	SPECIAL_EDUCATION("Special Education"),
	BILINGUAL_ENGLISH_AS_A_SECOND_LANGUAGE("Bilingual/English as a Second Language");

	private String prettyName;

	ProgramAssignmentType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
