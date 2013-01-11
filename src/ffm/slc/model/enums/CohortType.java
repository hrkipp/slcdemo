package ffm.slc.model.enums;

/**
 * The type of the cohort (e.g., academic intervention, classroom breakout, etc.)
 */
public enum CohortType {
	ACADEMIC_INTERVENTION("Academic Intervention"),
	ATTENDANCE_INTERVENTION("Attendance Intervention"),
	DISCIPLINE_INTERVENTION("Discipline Intervention"),
	CLASSROOM_PULLOUT("Classroom Pullout"),
	EXTRACURRICULAR_ACTIVITY("Extracurricular Activity"),
	FIELD_TRIP("Field Trip"),
	PRINCIPAL_WATCH_LIST("Principal Watch List"),
	COUNSELOR_LIST("Counselor List"),
	IN_SCHOOL_SUSPENSION("In-school Suspension"),
	STUDY_HALL("Study Hall"),
	OTHER("Other");

	private String prettyName;

	CohortType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
