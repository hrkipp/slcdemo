package ffm.slc.model.enums;

/**
 * Enumeration items for Section 504 disabilities.
 */
public enum Section504DisabilityItemType {
	ATTENTION_DEFICIT_HYPERACTIVITY_DISORDER_ADHD_("Attention Deficit Hyperactivity Disorder (ADHD)"),
	MEDICAL_CONDITION("Medical Condition"),
	MOTOR_IMPAIRMENT("Motor Impairment"),
	SENSORY_IMPAIRMENT("Sensory Impairment"),
	OTHER("Other");

	private String prettyName;

	Section504DisabilityItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
