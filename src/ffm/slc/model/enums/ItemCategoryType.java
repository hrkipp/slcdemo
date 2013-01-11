package ffm.slc.model.enums;

/**
 * Category or type of the assessment item. For example: Multiple choice Analytic Prose ....
 */
public enum ItemCategoryType {
	ANALYTIC("Analytic"),
	LIST_QUESTION("List Question"),
	MATH_MATRIX("Math Matrix"),
	MATCHING("Matching"),
	MULTIPLE_CHOICE("Multiple Choice"),
	PROSE("Prose"),
	RUBRIC("Rubric"),
	TRUE_FALSE("True-False");

	private String prettyName;

	ItemCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
