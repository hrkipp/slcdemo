package ffm.slc.model.enums;

/**
 * Reflects the type of employment or contract.
 */
public enum EmploymentStatusType {
	PROBATIONARY("Probationary"),
	CONTRACTUAL("Contractual"),
	SUBSTITUTE_TEMPORARY("Substitute/temporary"),
	TENURED_OR_PERMANENT("Tenured or permanent"),
	VOLUNTEER_NO_CONTRACT("Volunteer/no contract"),
	EMPLOYED_OR_AFFILIATED_WITH_OUTSIDE_ORGANIZATION("Employed or affiliated with outside organization"),
	CONTINGENT_UPON_FUNDING("Contingent upon funding"),
	NON_CONTRACTUAL("Non-contractual"),
	SELF_EMPLOYED_PART_TIME("Self-employed part-time"),
	EMPLOYED_OR_AFFILIATED_WITH_OUTSIDE_AGENCY_PART_TIME("Employed or affiliated with outside agency part-time"),
	OTHER("Other");

	private String prettyName;

	EmploymentStatusType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
