package ffm.slc.model.enums;

/**
 * The level of diploma/credential that is awarded to a student in recognition of his/her completion of the curricular requirements.
 */
public enum DiplomaLevelType {
	MINIMUM("Minimum"),
	RECOMMENDED("Recommended"),
	DISTINGUISHED("Distinguished"),
	CUM_LAUDE("Cum laude"),
	MAGNA_CUM_LAUDE("Magna cum laude"),
	SUMMA_CUM_LAUDE("Summa cum laude");

	private String prettyName;

	DiplomaLevelType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
