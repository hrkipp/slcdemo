package ffm.slc.model.enums;

/**
 * Indicates the reason for the difference, if any, between the official and actual lengths of a student�s disciplinary assignment.
 */
public enum DisciplineActionLengthDifferenceReasonType {
	NO_DIFFERENCE("No Difference"),
	TERM_MODIFIED_BY_DISTRICT("Term Modified By District"),
	TERM_MODIFIED_BY_COURT_ORDER("Term Modified By Court Order"),
	TERM_MODIFIED_BY_MUTUAL_AGREEMENT("Term Modified By Mutual Agreement"),
	STUDENT_COMPLETED_TERM_REQUIREMENTS_SOONER_THAN_EXPECTED("Student Completed Term Requirements Sooner Than Expected"),
	STUDENT_INCARCERATED("Student Incarcerated"),
	TERM_DECREASED_DUE_TO_EXTENUATING_HEALTH_RELATED_CIRCUMSTANCES("Term Decreased Due To Extenuating Health-Related Circumstances"),
	STUDENT_WITHDREW_FROM_SCHOOL("Student Withdrew From School"),
	SCHOOL_YEAR_ENDED("School Year Ended"),
	CONTINUATION_OF_PREVIOUS_YEAR_S_DISCIPLINARY_ACTION_ASSIGNMENT("Continuation Of Previous Year�s Disciplinary Action Assignment"),
	TERM_MODIFIED_BY_PLACEMENT_PROGRAM_DUE_TO_STUDENT_BEHAVIOR_WHILE_IN_THE_PLACEMENT("Term Modified By Placement Program Due To Student Behavior While In The Placement"),
	OTHER("Other");

	private String prettyName;

	DisciplineActionLengthDifferenceReasonType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
