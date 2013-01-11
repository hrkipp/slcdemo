package ffm.slc.model.enums;

/**
 * The method that the instructor of the class uses to report the performance and achievement of all students. It may be a qualitative method such as individualized teacher comments or a quantitative method such as a letter or a numerical grade. In some cases, more than one type of reporting method may be used.
 */
public enum AssessmentReportingMethodType {
	ACHIEVEMENT_PROFICIENCY_LEVEL("Achievement/proficiency level"),
	ACT_SCORE("ACT score"),
	ADAPTIVE_SCALE_SCORE("Adaptive scale score"),
	AGE_SCORE("Age score"),
	C_SCALED_SCORES("C-scaled scores"),
	COLLEGE_BOARD_EXAMINATION_SCORES("College Board examination scores"),
	COMPOSITE_SCORE("Composite Score"),
	COMPOSITE_RATING("Composite Rating"),
	COMPOSITION_SCORE("Composition Score"),
	GRADE_EQUIVALENT_OR_GRADE_LEVEL_INDICATOR("Grade equivalent or grade-level indicator"),
	GRADUATION_SCORE("Graduation score"),
	GROWTH_VALUE_ADDED_INDEXING("Growth/value-added/indexing"),
	INTERNATIONAL_BACCALAUREATE_SCORE("International Baccalaureate score"),
	LETTER_GRADE_MARK("Letter grade/mark"),
	MASTERY_LEVEL("Mastery level"),
	NORMAL_CURVE_EQUIVALENT("Normal curve equivalent"),
	NORMALIZED_STANDARD_SCORE("Normalized standard score"),
	NUMBER_SCORE("Number score"),
	PASS_FAIL("Pass-fail"),
	PERCENTILE("Percentile"),
	PERCENTILE_RANK("Percentile rank"),
	PROFICIENCY_LEVEL("Proficiency level"),
	PROMOTION_SCORE("Promotion score"),
	RANKING("Ranking"),
	RATIO_IQ_S("Ratio IQ's"),
	RAW_SCORE("Raw score"),
	SCALE_SCORE("Scale score"),
	STANDARD_AGE_SCORE("Standard age score"),
	STANDARD_ERROR_MEASUREMENT("Standard error measurement"),
	STANINE_SCORE("Stanine score"),
	STEN_SCORE("Sten score"),
	THETA("Theta"),
	T_SCORE("T-score"),
	VERTICAL_SCORE("Vertical score"),
	WORKPLACE_READINESS_SCORE("Workplace readiness score"),
	Z_SCORE("Z-score"),
	OTHER("Other"),
	NOT_APPLICABLE("Not applicable");

	private String prettyName;

	AssessmentReportingMethodType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
