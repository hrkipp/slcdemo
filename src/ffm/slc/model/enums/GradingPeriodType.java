package ffm.slc.model.enums;

/**
 * The name of the period for which grades are reported.
 */
public enum GradingPeriodType {
	FIRST_SIX_WEEKS("First Six Weeks"),
	SECOND_SIX_WEEKS("Second Six Weeks"),
	THIRD_SIX_WEEKS("Third Six Weeks"),
	FOURTH_SIX_WEEKS("Fourth Six Weeks"),
	FIFTH_SIX_WEEKS("Fifth Six Weeks"),
	SIXTH_SIX_WEEKS("Sixth Six Weeks"),
	FIRST_SEMESTER("First Semester"),
	SECOND_SEMESTER("Second Semester"),
	FIRST_SUMMER_SESSION("First Summer Session"),
	SECOND_SUMMER_SESSION("Second Summer Session"),
	THIRD_SUMMER_SESSION("Third Summer Session"),
	SUMMER_SEMESTER("Summer Semester"),
	FIRST_NINE_WEEKS("First Nine Weeks"),
	SECOND_NINE_WEEKS("Second Nine Weeks"),
	THIRD_NINE_WEEKS("Third Nine Weeks"),
	FOURTH_NINE_WEEKS("Fourth Nine Weeks"),
	FIRST_TRIMESTER("First Trimester"),
	SECOND_TRIMESTER("Second Trimester"),
	THIRD_TRIMESTER("Third Trimester"),
	END_OF_YEAR("End of Year");

	private String prettyName;

	GradingPeriodType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
