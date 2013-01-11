package ffm.slc.model.enums;

/**
 * An indication of the type of Title I program, if any, in which the student is participating and served.
 */
public enum TitleIPartAParticipantType {
	PUBLIC_TARGETED_ASSISTANCE_PROGRAM("Public Targeted Assistance Program"),
	PUBLIC_SCHOOLWIDE_PROGRAM("Public Schoolwide Program"),
	PRIVATE_SCHOOL_STUDENTS_PARTICIPATING("Private school students participating"),
	LOCAL_NEGLECTED_PROGRAM("Local Neglected Program"),
	WAS_NOT_SERVED("Was not served");

	private String prettyName;

	TitleIPartAParticipantType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
