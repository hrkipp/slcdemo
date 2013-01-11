package ffm.slc.model.enums;

/**
 * A school that has been designed: 1) to attract students of different racial/ethnic backgrounds for the purpose of reducing, preventing, or eliminating racial isolation; and/or 2)to provide an academic or social focus on a particular theme (e.g., science/math, performing arts, gifted/talented, or foreign language).
 */
public enum MagnetSpecialProgramEmphasisSchoolType {
	ALL_STUDENTS_PARTICIPATE("All students participate"),
	NO_STUDENTS_PARTICIPATE("No students participate"),
	SOME_BUT_NOT_ALL_STUDENTS_PARTICIPATE("Some, but not all, students participate");

	private String prettyName;

	MagnetSpecialProgramEmphasisSchoolType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
