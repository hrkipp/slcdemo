package ffm.slc.model.enums;

/**
 * The reason the child left the program within a school or district.
 */
public enum ReasonExitedType {
	TRANSFER_TO_REGULAR_EDUCATION("Transfer to regular education"),
	RECEIVED_A_CERTIFICATE("Received a certificate"),
	DIED("Died"),
	DIED_OR_IS_PERMANENTLY_INCAPACITATED("Died or is permanently incapacitated"),
	DISCONTINUED_SCHOOLING("Discontinued schooling"),
	GRADUATED_WITH_A_HIGH_SCHOOL_DIPLOMA("Graduated with a high school diploma"),
	RECEIVED_CERTIFICATE_OF_COMPLETION_MODIFIED_DIPLOMA_OR_FINISHED_IEP_REQUIREMENTS("Received certificate of completion, modified diploma, or finished IEP requirements"),
	PROGRAM_COMPLETION("Program completion"),
	REACHED_MAXIMUM_AGE("Reached maximum age"),
	NO_LONGER_RECEIVING_SPECIAL_EDUCATION("No longer receiving special education"),
	REFUSED_SERVICES("Refused services"),
	TRANSFERRED_TO_ANOTHER_DISTRICT_OR_SCHOOL_KNOWN_TO_BE_CONTINUING_IN_PROGRAM_SERVICE("Transferred to another district or school, known to be continuing in program/service"),
	TRANSFERRED_TO_ANOTHER_DISTRICT_OR_SCHOOL_NOT_KNOWN_TO_BE_CONTINUING_IN_PROGRAM_SERVICE("Transferred to another district or school, not known to be continuing in program/service"),
	TRANSFERRED_TO_ANOTHER_DISTRICT_OR_SCHOOL_KNOWN_NOT_TO_BE_CONTINUING_IN_PROGRAM_SERVICE("Transferred to another district or school, known not to be continuing in program/service"),
	SUSPENDED_FROM_SCHOOL("Suspended from school"),
	DISCONTINUED_SCHOOLING_SPECIAL_EDUCATION_ONLY("Discontinued schooling, special education only"),
	DISCONTINUED_SCHOOLING_NOT_SPECIAL_EDUCATION("Discontinued schooling, not special education"),
	EXPULSION("Expulsion"),
	PROGRAM_DISCONTINUED("Program discontinued"),
	COMPLETION_OF_IFSP_PRIOR_TO_REACHING_MAXIMUM_AGE_FOR_PART_C("Completion of IFSP prior to reaching maximum age for Part C"),
	ELIGIBLE_FOR_IDEA_PART_B("Eligible for IDEA, Part B"),
	NOT_ELIGIBLE_FOR_PART_B_EXIT_WITH_REFERRALS_TO_OTHER_PROGRAMS("Not eligible for Part B, exit with referrals to other programs"),
	PART_B_ELIGIBILITY_NOT_DETERMINED("Part B eligibility not determined"),
	MOVED_OUT_OF_STATE("Moved out of state"),
	WITHDRAWAL_BY_A_PARENT_OR_GUARDIAN_("Withdrawal by a parent (or guardian)"),
	UNKNOWN_REASON("Unknown reason"),
	NOT_ELIGIBLE_FOR_PART_B_EXIT_WITH_NO_REFERRALS("Not eligible for Part B, exit with no referrals"),
	ATTEMPTS_TO_CONTACT_THE_PARENT_AND_OR_CHILD_WERE_UNSUCCESSFUL("Attempts to contact the parent and/or child were unsuccessful"),
	OTHER("Other");

	private String prettyName;

	ReasonExitedType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
