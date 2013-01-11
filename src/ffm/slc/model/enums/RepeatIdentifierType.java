package ffm.slc.model.enums;

/**
 * An indication as to whether a student has previously taken a given course.
 */
public enum RepeatIdentifierType {
	REPEATED_COUNTED_IN_GRADE_POINT_AVERAGE("Repeated, counted in grade point average"),
	REPEATED_NOT_COUNTED_IN_GRADE_POINT_AVERAGE("Repeated, not counted in grade point average"),
	NOT_REPEATED("Not repeated"),
	OTHER("Other");

	private String prettyName;

	RepeatIdentifierType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
