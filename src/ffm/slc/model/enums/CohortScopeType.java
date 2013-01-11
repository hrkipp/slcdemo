package ffm.slc.model.enums;

/**
 * The scope of cohort (e.g., school, district, classroom, etc.)
 */
public enum CohortScopeType {
	DISTRICT("District"),
	SCHOOL("School"),
	CLASSROOM("Classroom"),
	TEACHER("Teacher"),
	PRINCIPAL("Principal"),
	COUNSELOR("Counselor"),
	STATEWIDE("Statewide");

	private String prettyName;

	CohortScopeType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
