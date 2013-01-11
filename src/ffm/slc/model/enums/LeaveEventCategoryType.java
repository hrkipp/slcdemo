package ffm.slc.model.enums;

/**
 * A code describing the type of the leave event.
 */
public enum LeaveEventCategoryType {
	VACATION("Vacation"),
	JURY("Jury"),
	TRAINING("Training"),
	FLEX_TIME("Flex Time"),
	WORK_COMPENSATION("Work Compensation"),
	ADMINISTRATIVE("Administrative"),
	ANNUAL_LEAVE("Annual leave"),
	BEREAVEMENT("Bereavement"),
	COMPENSATORY_LEAVE_TIME("Compensatory leave time"),
	FAMILY_AND_MEDICAL_LEAVE("Family and medical leave"),
	GOVERNMENT_REQUESTED("Government-requested"),
	MILITARY_LEAVE("Military leave"),
	PERSONAL("Personal"),
	RELEASE_TIME("Release time"),
	SABBATICAL_LEAVE("Sabbatical leave"),
	SICK_LEAVE("Sick leave"),
	SUSPENSION("Suspension"),
	OTHER("Other");

	private String prettyName;

	LeaveEventCategoryType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
