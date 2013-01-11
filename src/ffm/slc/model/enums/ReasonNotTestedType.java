package ffm.slc.model.enums;

/**
 * The primary reason student is not tested. For example: Absent Refusal by parent Refusal by student Medical waiver Illness Disruptive behavior LEP Exempt ...
 */
public enum ReasonNotTestedType {
	ABSENT("Absent"),
	LEP_EXEMPT("LEP exempt"),
	LEP_POSTPONEMENT("LEP postponement"),
	NOT_APPROPRIATE_ARD_DECISION_("Not appropriate (ARD decision)"),
	NOT_TESTED_ARD_DECISION_("Not tested (ARD decision)"),
	ALTERNATE_ASSESSMENT_ADMINISTERED("Alternate assessment administered"),
	PARENTAL_WAIVER("Parental waiver"),
	FOREIGN_EXCHANGE_STUDENT_WAIVER("Foreign exchange student waiver"),
	REFUSAL_BY_PARENT("Refusal by parent"),
	REFUSAL_BY_STUDENT("Refusal by student"),
	MEDICAL_WAIVER("Medical waiver"),
	DISRUPTIVE_BEHAVIOR("Disruptive behavior"),
	PREVIOUSLY_PASSED_THE_EXAMINATION("Previously passed the examination"),
	OTHER("Other");

	private String prettyName;

	ReasonNotTestedType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
