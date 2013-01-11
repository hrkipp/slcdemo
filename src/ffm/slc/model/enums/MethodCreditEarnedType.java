package ffm.slc.model.enums;

/**
 * The method the credits were earned, for example: Classroom, Examination, Transfer
 */
public enum MethodCreditEarnedType {
	ADULT_EDUCATION_CREDIT("Adult education credit"),
	CLASSROOM_CREDIT("Classroom credit"),
	CONVERTED_OCCUPATIONAL_EXPERIENCE_CREDIT("Converted occupational experience credit"),
	CORRESPONDENCE_CREDIT("Correspondence credit"),
	CREDIT_BY_EXAMINATION("Credit by examination"),
	CREDIT_RECOVERY("Credit recovery"),
	ONLINE_CREDIT("Online credit"),
	TRANSFER_CREDIT("Transfer credit"),
	VOCATIONAL_CREDIT("Vocational credit");

	private String prettyName;

	MethodCreditEarnedType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
