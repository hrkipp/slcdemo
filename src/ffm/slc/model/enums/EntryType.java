package ffm.slc.model.enums;

/**
 * The process by which a student enters a school during a given academic session.
 */
public enum EntryType {
	TRANSFER_FROM_A_PUBLIC_SCHOOL_IN_THE_SAME_LOCAL_EDUCATION_AGENCY("Transfer from a public school in the same local education agency"),
	TRANSFER_FROM_A_PUBLIC_SCHOOL_IN_A_DIFFERENT_LOCAL_EDUCATION_AGENCY_IN_THE_SAME_STATE("Transfer from a public school in a different local education agency in the same state"),
	TRANSFER_FROM_A_PUBLIC_SCHOOL_IN_A_DIFFERENT_STATE("Transfer from a public school in a different state"),
	TRANSFER_FROM_A_PRIVATE_NON_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_THE_SAME_LOCAL_EDUCATION_AGENCY("Transfer from a private, non-religiously-affiliated school in the same local education agency"),
	TRANSFER_FROM_A_PRIVATE_NON_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_LOCAL_EDUCATION_AGENCY_IN_THE_SAME_STATE("Transfer from a private, non-religiously-affiliated school in a different local education agency in the same state"),
	TRANSFER_FROM_A_PRIVATE_NON_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_STATE("Transfer from a private, non-religiously-affiliated school in a different state"),
	TRANSFER_FROM_A_PRIVATE_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_THE_SAME_LOCAL_EDUCATION_AGENCY("Transfer from a private, religiously-affiliated school in the same local education agency"),
	TRANSFER_FROM_A_PRIVATE_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_LOCAL_EDUCATION_AGENCY_IN_THE_SAME_STATE("Transfer from a private, religiously-affiliated school in a different local education agency in the same state"),
	TRANSFER_FROM_A_PRIVATE_RELIGIOUSLY_AFFILIATED_SCHOOL_IN_A_DIFFERENT_STATE("Transfer from a private, religiously-affiliated school in a different state"),
	TRANSFER_FROM_A_SCHOOL_OUTSIDE_OF_THE_COUNTRY("Transfer from a school outside of the country"),
	TRANSFER_FROM_AN_INSTITUTION("Transfer from an institution"),
	TRANSFER_FROM_A_CHARTER_SCHOOL("Transfer from a charter school"),
	TRANSFER_FROM_HOME_SCHOOLING("Transfer from home schooling"),
	RE_ENTRY_FROM_THE_SAME_SCHOOL_WITH_NO_INTERRUPTION_OF_SCHOOLING("Re-entry from the same school with no interruption of schooling"),
	RE_ENTRY_AFTER_A_VOLUNTARY_WITHDRAWAL("Re-entry after a voluntary withdrawal"),
	RE_ENTRY_AFTER_AN_INVOLUNTARY_WITHDRAWAL("Re-entry after an involuntary withdrawal"),
	ORIGINAL_ENTRY_INTO_A_UNITED_STATES_SCHOOL("Original entry into a United States school"),
	ORIGINAL_ENTRY_INTO_A_UNITED_STATES_SCHOOL_FROM_A_FOREIGN_COUNTRY_WITH_NO_INTERRUPTION_IN_SCHOOLING("Original entry into a United States school from a foreign country with no interruption in schooling"),
	ORIGINAL_ENTRY_INTO_A_UNITED_STATES_SCHOOL_FROM_A_FOREIGN_COUNTRY_WITH_AN_INTERRUPTION_IN_SCHOOLING("Original entry into a United States school from a foreign country with an interruption in schooling"),
	NEXT_YEAR_SCHOOL("Next year school"),
	OTHER("Other");

	private String prettyName;

	EntryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
