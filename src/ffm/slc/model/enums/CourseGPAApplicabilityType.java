package ffm.slc.model.enums;

/**
 * An indicator of whether or not this course being described is included in the computation of the student�s Grade Point Average, and if so, if it weighted differently from regular courses.
 */
public enum CourseGPAApplicabilityType {
	APPLICABLE("Applicable"),
	NOT_APPLICABLE("Not Applicable"),
	WEIGHTED("Weighted");

	private String prettyName;

	CourseGPAApplicabilityType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
