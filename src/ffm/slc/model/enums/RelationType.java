package ffm.slc.model.enums;

/**
 * The nature of an individual's relationship to a student.
 */
public enum RelationType {
	ADOPTED_DAUGHTER("Adopted daughter"),
	ADOPTED_SON("Adopted son"),
	ADOPTIVE_PARENTS("Adoptive parents"),
	ADVISOR("Advisor"),
	AGENCY_REPRESENTATIVE("Agency representative"),
	AUNT("Aunt"),
	BROTHER_HALF("Brother, half"),
	BROTHER_NATURAL_ADOPTIVE("Brother, natural/adoptive"),
	BROTHER_STEP("Brother, step"),
	BROTHER_IN_LAW("Brother-in-law"),
	CASE_WORKER_CPS("Case Worker, CPS"),
	COURT_APPOINTED_GUARDIAN("Court appointed guardian"),
	COUSIN("Cousin"),
	DAUGHTER("Daughter"),
	DAUGHTER_IN_LAW("Daughter-in-law"),
	DEPENDENT("Dependent"),
	DOCTOR("Doctor"),
	EMPLOYER("Employer"),
	EMERGENCY_CONTACT("Emergency Contact"),
	FAMILY_MEMBER("Family member"),
	FATHER_S_SIGNIFICANT_OTHER("Father's significant other"),
	FATHER_FOSTER("Father, foster"),
	FATHER("Father"),
	FATHER_STEP("Father, step"),
	FATHER_IN_LAW("Father-in-law"),
	FIANCE("Fiance"),
	FIANCEE("Fiancee"),
	FORMER_HUSBAND("Former husband"),
	FORMER_WIFE("Former wife"),
	FOSTER_DAUGHTER("Foster daughter"),
	FOSTER_PARENT("Foster parent"),
	FOSTER_SON("Foster son"),
	FRIEND("Friend"),
	GRANDDAUGHTER("Granddaughter"),
	GRANDPARENT("Grandparent"),
	GREAT_GRANDPARENT("Great Grandparent"),
	GRANDSON("Grandson"),
	GREAT_AUNT("Great aunt"),
	GREAT_UNCLE("Great uncle"),
	GUARDIAN("Guardian"),
	HUSBAND("Husband"),
	LIFE_PARTNER("Life partner"),
	LIFE_PARTNER_OF_PARENT("Life partner of parent"),
	MINISTER_OR_PRIEST("Minister or priest"),
	MOTHER_S_SIGNIFICANT_OTHER("Mother's significant other"),
	MOTHER_FOSTER("Mother, foster"),
	MOTHER("Mother"),
	MOTHER_STEP("Mother, step"),
	MOTHER_IN_LAW("Mother-in-law"),
	NEPHEW("Nephew"),
	NIECE("Niece"),
	NONE("None"),
	OTHER("Other"),
	PARENT("Parent"),
	PARTNER("Partner"),
	PARTNER_OF_PARENT("Partner of parent"),
	PROBATION_OFFICER("Probation officer"),
	SIBLING("Sibling"),
	SISTER_HALF("Sister, half"),
	SISTER_NATURAL_ADOPTIVE("Sister, natural/adoptive"),
	SISTER_STEP("Sister, step"),
	SISTER_IN_LAW("Sister-in-law"),
	SON("Son"),
	SON_IN_LAW("Son-in-law"),
	SPOUSE("Spouse"),
	STEPDAUGHTER("Stepdaughter"),
	STEPSON("Stepson"),
	STEPSIBLING("Stepsibling"),
	UNCLE("Uncle"),
	WARD("Ward"),
	WIFE("Wife");

	private String prettyName;

	RelationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
