package ffm.slc.model.enums;

/**
 * Indicator of the eligibility of the student to receive special education services according to the Individuals with Disabilities Education Act (IDEA).
 */
public enum IdeaEligibilityType {
	NOT_APPLICABLE_TO_THIS_STUDENT("Not Applicable To This Student"),
	INDIVIDUALS_WITH_DISABILITIES_EDUCATION_ACT("Individuals With Disabilities Education Act");

	private String prettyName;

	IdeaEligibilityType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
