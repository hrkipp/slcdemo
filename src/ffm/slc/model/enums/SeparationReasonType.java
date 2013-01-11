package ffm.slc.model.enums;

/**
 * Reason for terminating the employment; for example: Employment in education, Employment outside of education, Retirement, Family/personal relocation, Change of assignment
 */
public enum SeparationReasonType {
	EMPLOYMENT_IN_EDUCATION("Employment in education"),
	EMPLOYMENT_OUTSIDE_OF_EDUCATION("Employment outside of education"),
	RETIREMENT("Retirement"),
	FAMILY_PERSONAL_RELOCATION("Family/personal relocation"),
	CHANGE_OF_ASSIGNMENT("Change of assignment"),
	FORMAL_STUDY_OR_RESEARCH("Formal study or research"),
	ILLNESS_DISABILITY("Illness/disability"),
	HOMEMAKING_CARING_FOR_A_FAMILY_MEMBER("Homemaking/caring for a family member"),
	LAYOFF_DUE_TO_BUDGETARY_REDUCTION("Layoff due to budgetary reduction"),
	LAYOFF_DUE_TO_ORGANIZATIONAL_RESTRUCTURING("Layoff due to organizational restructuring"),
	LAYOFF_DUE_TO_DECREASED_WORKLOAD("Layoff due to decreased workload"),
	DISCHARGE_DUE_TO_UNSUITABILITY("Discharge due to unsuitability"),
	DISCHARGE_DUE_TO_MISCONDUCT("Discharge due to misconduct"),
	DISCHARGE_DUE_TO_CONTINUED_ABSENCE_OR_TARDINESS("Discharge due to continued absence or tardiness"),
	DISCHARGE_DUE_TO_A_FALSIFIED_APPLICATION_FORM("Discharge due to a falsified application form"),
	DISCHARGE_DUE_TO_CREDENTIAL_REVOKED_OR_SUSPENDED("Discharge due to credential revoked or suspended"),
	DISCHARGE_DUE_TO_UNSATISFACTORY_WORK_PERFORMANCE("Discharge due to unsatisfactory work performance"),
	DEATH("Death"),
	PERSONAL_REASON("Personal reason"),
	LAY_OFF_DUE_TO_LACK_OF_FUNDING("Lay off due to lack of funding"),
	LOST_CREDENTIAL("Lost credential"),
	UNKNOWN("Unknown"),
	OTHER("Other");

	private String prettyName;

	SeparationReasonType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
