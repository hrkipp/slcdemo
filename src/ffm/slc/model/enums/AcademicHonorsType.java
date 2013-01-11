package ffm.slc.model.enums;

/**
 * A designation of the type of academic distinctions earned by or awarded to the student.
 */
public enum AcademicHonorsType {
	HONOR_ROLL("Honor roll"),
	HONOR_SOCIETY("Honor society"),
	HONORABLE_MENTION("Honorable mention"),
	HONORS_PROGRAM("Honors program"),
	PRIZE_AWARDS("Prize awards"),
	SCHOLARSHIPS("Scholarships"),
	AWARDING_OF_UNITS_OF_VALUE("Awarding of units of value"),
	CITIZENSHIP_AWARD_RECOGNITION("Citizenship award/recognition"),
	COMPLETION_OF_REQUIREMENT_BUT_NO_UNITS_OF_VALUE_AWARDED("Completion of requirement, but no units of value awarded"),
	ATTENDANCE_AWARD("Attendance award"),
	CERTIFICATE("Certificate"),
	HONOR_AWARD("Honor award"),
	LETTER_OF_STUDENT_COMMENDATION("Letter of student commendation"),
	MEDALS("Medals"),
	NATIONAL_MERIT_SCHOLAR("National Merit scholar"),
	POINTS("Points"),
	PROMOTION_OR_ADVANCEMENT("Promotion or advancement"),
	OTHER("Other");

	private String prettyName;

	AcademicHonorsType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
