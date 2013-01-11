package ffm.slc.model.enums;

/**
 * An indication of the pre-determined criteria for granting the teaching credential that an individual holds.
 */
public enum TeachingCredentialBasisType {
	_4_YEAR_BACHELOR_S_DEGREE("4-year bachelor's degree"),
	_5_YEAR_BACHELOR_S_DEGREE("5-year bachelor's degree"),
	MASTER_S_DEGREE("Master's degree"),
	DOCTORAL_DEGREE("Doctoral degree"),
	MET_STATE_TESTING_REQUIREMENT("Met state testing requirement"),
	SPECIAL_ALTERNATIVE_PROGRAM_COMPLETION("Special/alternative program completion"),
	RELEVANT_EXPERIENCE("Relevant experience"),
	CREDENTIALS_BASED_ON_RECIPROCATION_WITH_ANOTHER_STATE("Credentials based on reciprocation with another state");

	private String prettyName;

	TeachingCredentialBasisType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
