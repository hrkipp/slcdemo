package ffm.slc.model.enums;

/**
 * The type of position the staff member holds in the specific class/section.
 */
public enum ClassroomPositionType {
	TEACHER_OF_RECORD("Teacher of Record"),
	ASSISTANT_TEACHER("Assistant Teacher"),
	SUPPORT_TEACHER("Support Teacher"),
	SUBSTITUTE_TEACHER("Substitute Teacher");

	private String prettyName;

	ClassroomPositionType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
