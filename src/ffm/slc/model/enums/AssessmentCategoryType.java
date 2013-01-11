package ffm.slc.model.enums;

/**
 * The category of an assessment based on format and content. For example: Achievement test Advanced placement test Alternate assessment/grade-level standards Attitudinal test Cognitive and perceptual skills test ...
 */
public enum AssessmentCategoryType {
	ACHIEVEMENT_TEST("Achievement test"),
	ADVANCED_PLACEMENT("Advanced Placement"),
	INTERNATIONAL_BACCALAUREATE("International Baccalaureate"),
	APTITUDE_TEST("Aptitude test"),
	ATTITUDINAL_TEST("Attitudinal test"),
	BENCHMARK_TEST("Benchmark test"),
	CLASS_TEST("Class test"),
	CLASS_QUIZ("class quiz"),
	COLLEGE_ENTRANCE_EXAM("College entrance exam"),
	COGNITIVE_AND_PERCEPTUAL_SKILLS_TEST("Cognitive and perceptual skills test"),
	DEVELOPMENTAL_OBSERVATION("Developmental observation"),
	ENGLISH_PROFICIENCY_SCREENING_TEST("English proficiency screening test"),
	FOREIGN_LANGUAGE_PROFICIENCY_TEST("Foreign language proficiency test"),
	INTEREST_INVENTORY("Interest inventory"),
	MANUAL_DEXTERITY_TEST("Manual dexterity test"),
	MENTAL_ABILITY_INTELLIGENCE_TEST("Mental ability (intelligence) test"),
	PERFORMANCE_ASSESSMENT("Performance assessment"),
	PERSONALITY_TEST("Personality test"),
	PORTFOLIO_ASSESSMENT("Portfolio assessment"),
	PSYCHOLOGICAL_TEST("Psychological test"),
	PSYCHOMOTOR_TEST("Psychomotor test"),
	READING_READINESS_TEST("Reading readiness test"),
	STATE_SUMMATIVE_ASSESSMENT_3_8_GENERAL("State summative assessment 3-8 general"),
	STATE_HIGH_SCHOOL_SUBJECT_ASSESSMENT("State high school subject assessment"),
	STATE_HIGH_SCHOOL_COURSE_ASSESSMENT("State high school course assessment"),
	STATE_ALTERNATIVE_ASSESSMENT_GRADE_LEVEL_STANDARDS("State alternative assessment/grade-level standards"),
	STATE_ALTERNATIVE_ASSESSMENT_MODIFIED_STANDARDS("State alternative assessment/modified standards"),
	STATE_ALTERNATE_ASSESSMENT_ELL("State alternate assessment/ELL"),
	STATE_ENGLISH_PROFICIENCY_TEST("State English proficiency test"),
	OTHER("Other");

	private String prettyName;

	AssessmentCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
