package ffm.slc.model.enums;

/**
 * An indication of the category of a legal document giving authorization to perform teaching assignment services.
 */
public enum TeachingCredentialType {
	EMERGENCY("Emergency"),
	EMERGENCY_CERTIFIED("Emergency Certified"),
	EMERGENCY_NON_CERTIFIED("Emergency Non-Certified"),
	EMERGENCY_TEACHING("Emergency Teaching"),
	INTERN("Intern"),
	MASTER("Master"),
	NONRENEWABLE("Nonrenewable"),
	ONE_YEAR("One Year"),
	OTHER("Other"),
	PARAPROFESSIONAL("Paraprofessional"),
	PROFESSIONAL("Professional"),
	PROBATIONARY("Probationary"),
	PROVISIONAL("Provisional"),
	REGULAR("Regular"),
	RETIRED("Retired"),
	SPECIALIST("Specialist"),
	SUBSTITUTE("Substitute"),
	TEACHERASSISTANT("TeacherAssistant"),
	TEMPORARY("Temporary"),
	SPECIAL_ASSIGNMENT("Special Assignment"),
	STANDARD("Standard"),
	STANDARD_PROFESSIONAL("Standard Professional"),
	TEMPORARY_CLASSROOM("Temporary Classroom"),
	TEMPORARY_EXEMPTION("Temporary Exemption"),
	UNKNOWN("Unknown"),
	UNKNOWN_PERMIT("Unknown Permit"),
	VOCATIONAL("Vocational"),
	STANDARD_PARAPROFESSIONAL("Standard Paraprofessional"),
	PROBATIONARY_EXTENSION("Probationary Extension"),
	PROBATIONARY_SECOND_EXTENSION("Probationary Second Extension"),
	VISITING_INTERNATIONAL_TEACHER("Visiting International Teacher"),
	DISTRICT_LOCAL("District Local");

	private String prettyName;

	TeachingCredentialType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
