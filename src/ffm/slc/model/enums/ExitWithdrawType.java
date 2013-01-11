package ffm.slc.model.enums;

/**
 * The circumstances under which the student exited from membership in an educational institution.
 */
public enum ExitWithdrawType {
	STUDENT_IS_IN_A_DIFFERENT_PUBLIC_SCHOOL_IN_THE_SAME_LOCAL_EDUCATION_AGENCY("Student is in a different public school in the same local education agency"),
	TRANSFERRED_TO_A_PUBLIC_SCHOOL_IN_A_DIFFERENT_LOCAL_EDUCATION_AGENCY_IN_THE_SAME_STATE("Transferred to a public school in a different local education agency in the same state"),
	TRANSFERRED_TO_A_PUBLIC_SCHOOL_IN_A_DIFFERENT_STATE("Transferred to a public school in a different state"),
	TRANSFERRED_TO_A_PRIVATE_NON_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_THE_SAME_LOCAL_EDUCATION_AGENCY("Transferred to a private, non-religiously-affiliated school in the same local education agency"),
	TRANSFERRED_TO_A_PRIVATE_NON_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_LOCAL_EDUCATION_AGENCY_IN_THE_SAME_STATE("Transferred to a private, non-religiously-affiliated school in a different local education agency in the same state"),
	TRANSFERRED_TO_A_PRIVATE_NON_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_STATE("Transferred to a private, non-religiously-affiliated school in a different state"),
	TRANSFERRED_TO_A_PRIVATE_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_THE_SAME_LOCAL_EDUCATION_AGENCY("Transferred to a private, religiously-affiliated school in the same local education agency"),
	TRANSFERRED_TO_A_PRIVATE_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_LOCAL_EDUCATION_AGENCY_IN_THE_SAME_STATE("Transferred to a private, religiously-affiliated school in a different local education agency in the same state"),
	TRANSFERRED_TO_A_PRIVATE_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_STATE("Transferred to a private, religiously-affiliated school in a different state"),
	TRANSFERRED_TO_A_SCHOOL_OUTSIDE_OF_THE_COUNTRY("Transferred to a school outside of the country"),
	TRANSFERRED_TO_AN_INSTITUTION("Transferred to an institution"),
	TRANSFERRED_TO_HOME_SCHOOLING("Transferred to home schooling"),
	TRANSFERRED_TO_A_CHARTER_SCHOOL("Transferred to a charter school"),
	GRADUATED_WITH_REGULAR_ADVANCED_INTERNATIONAL_BACCALAUREATE_OR_OTHER_TYPE_OF_DIPLOMA("Graduated with regular, advanced, International Baccalaureate, or other type of diploma"),
	COMPLETED_SCHOOL_WITH_OTHER_CREDENTIALS("Completed school with other credentials"),
	DIED_OR_IS_PERMANENTLY_INCAPACITATED("Died or is permanently incapacitated"),
	WITHDRAWN_DUE_TO_ILLNESS("Withdrawn due to illness"),
	EXPELLED_OR_INVOLUNTARILY_WITHDRAWN("Expelled or involuntarily withdrawn"),
	REACHED_MAXIMUM_AGE_FOR_SERVICES("Reached maximum age for services"),
	DISCONTINUED_SCHOOLING("Discontinued schooling"),
	COMPLETED_GRADE_12_BUT_DID_NOT_MEET_ALL_GRADUATION_REQUIREMENTS("Completed grade 12, but did not meet all graduation requirements"),
	ENROLLED_IN_A_POSTSECONDARY_EARLY_ADMISSION_PROGRAM_ELIGIBLE_TO_RETURN("Enrolled in a postsecondary early admission program, eligible to return"),
	NOT_ENROLLED_UNKNOWN_STATUS("Not enrolled, unknown status"),
	STUDENT_IS_IN_THE_SAME_LOCAL_EDUCATION_AGENCY_AND_RECEIVING_EDUCATION_SERVICES_BUT_IS_NOT_ASSIGNED_TO_A_PARTICULAR_SCHOOL("Student is in the same local education agency and receiving education services, but is not assigned to a particular school"),
	ENROLLED_IN_AN_ADULT_EDUCATION_OR_TRAINING_PROGRAM("Enrolled in an adult education or training program"),
	COMPLETED_A_STATE_RECOGNIZED_VOCATIONAL_EDUCATION_PROGRAM("Completed a state-recognized vocational education program"),
	NOT_ENROLLED_ELIGIBLE_TO_RETURN("Not enrolled, eligible to return"),
	ENROLLED_IN_A_FOREIGN_EXCHANGE_PROGRAM_ELIGIBLE_TO_RETURN("Enrolled in a foreign exchange program, eligible to return"),
	WITHDRAWN_FROM_SCHOOL_UNDER_THE_AGE_FOR_COMPULSORY_ATTENDANCE_ELIGIBLE_TO_RETURN("Withdrawn from school, under the age for compulsory attendance; eligible to return"),
	EXITED("Exited"),
	STUDENT_IS_IN_A_CHARTER_SCHOOL_MANAGED_BY_THE_SAME_LOCAL_EDUCATION_AGENCY("Student is in a charter school managed by the same local education agency"),
	COMPLETED_WITH_A_STATE_RECOGNIZED_EQUIVALENCY_CERTIFICATE("Completed with a state-recognized equivalency certificate"),
	REMOVED_BY_CHILD_PROTECTIVE_SERVICES("Removed by Child Protective Services"),
	TRANSFERRED_TO_A_PRIVATE_SCHOOL_IN_THE_STATE("Transferred to a private school in the state"),
	GRADUATED_OUTSIDE_OF_STATE_PRIOR_TO_ENROLLMENT("Graduated outside of state prior to enrollment"),
	COMPLETED_EQUIVALENCY_CERTIFICATE_OUTSIDE_OF_STATE("Completed equivalency certificate outside of state"),
	ENROLLED_IN_UNIVERSITY_HIGH_SCHOOL_DIPLOMA_PROGRAM("Enrolled in University High School Diploma Program"),
	COURT_ORDERED_TO_A_GED_PROGRAM_HAS_NOT_EARNED_A_GED("Court ordered to a GED program, has not earned a GED"),
	INCARCERATED_IN_A_STATE_JAIL_OR_FEDERAL_PENITENTIARY_AS_AN_ADULT("Incarcerated in a state jail or federal penitentiary as an adult"),
	GRADUATED_FROM_ANOTHER_STATE_UNDER_INTERSTATE_COMPACT_ON_EDUCATIONAL_OPPORTUNITY_FOR_MILITARY_CHILDREN("Graduated from another state under Interstate Compact on Educational Opportunity for Military Children"),
	DROPOUT("Dropout"),
	END_OF_SCHOOL_YEAR("End of school year"),
	INVALID_ENROLLMENT("Invalid enrollment"),
	NO_SHOW("No show"),
	OTHER("Other");

	private String prettyName;

	ExitWithdrawType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
