package ffm.slc.model.enums;

/**
 * The evidence presented to verify one's personal identity; for example: drivers license, passport, birth certificate, etc.
 */
public enum PersonalInformationVerificationType {
	BAPTISMAL_OR_CHURCH_CERTIFICATE("Baptismal or church certificate"),
	BIRTH_CERTIFICATE("Birth certificate"),
	DRIVERS_LICENSE("Drivers license"),
	ENTRY_IN_FAMILY_BIBLE("Entry in family Bible"),
	HOSPITAL_CERTIFICATE("Hospital certificate"),
	IMMIGRATION_DOCUMENT_VISA("Immigration document/visa"),
	LIFE_INSURANCE_POLICY("Life insurance policy"),
	OTHER("Other"),
	OTHER_NON_OFFICIAL_DOCUMENT("Other non-official document"),
	OTHER_OFFICIAL_DOCUMENT("Other official document"),
	PARENTS_AFFIDAVIT("Parents affidavit"),
	PASSPORT("Passport"),
	PHYSICIANS_CERTIFICATE("Physicians certificate"),
	PREVIOUSLY_VERIFIED_SCHOOL_RECORDS("Previously verified school records"),
	STATE_ISSUED_ID("State-issued ID");

	private String prettyName;

	PersonalInformationVerificationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
