package ffm.slc.model.enums;

/**
 * A code describing the type of postsecondary event (e.g., college application or acceptance)
 */
public enum PostSecondaryEventCategoryType {
	COLLEGE_APPLICATION("College Application"),
	COLLEGE_ACCEPTANCE("College Acceptance"),
	COLLEGE_ENROLLMENT("College Enrollment"),
	FAFSA_APPLICATION("FAFSA Application"),
	VOCATION_CERTIFICATION("Vocation Certification");

	private String prettyName;

	PostSecondaryEventCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
