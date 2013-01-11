package ffm.slc.model.enums;

/**
 * An individual's title of employment, official status or rank.
 */
public enum StaffClassificationType {
	ART_THERAPIST("Art Therapist"),
	ATHLETIC_TRAINER("Athletic Trainer"),
	ASSISTANT_PRINCIPAL("Assistant Principal"),
	ASSISTANT_SUPERINTENDENT("Assistant Superintendent"),
	CERTIFIED_INTERPRETER("Certified Interpreter"),
	COUNSELOR("Counselor"),
	HIGH_SCHOOL_COUNSELOR("High School Counselor"),
	INSTRUCTIONAL_COORDINATOR("Instructional Coordinator"),
	INSTRUCTIONAL_AIDE("Instructional Aide"),
	LIBRARIANS_MEDIA_SPECIALISTS("Librarians/Media Specialists"),
	LEA_ADMINISTRATOR("LEA Administrator"),
	LEA_SPECIALIST("LEA Specialist"),
	LEA_SYSTEM_ADMINISTRATOR("LEA System Administrator"),
	LEA_ADMINISTRATIVE_SUPPORT_STAFF("LEA Administrative Support Staff"),
	LIBRARIAN("Librarian"),
	PRINCIPAL("Principal"),
	PHYSICAL_THERAPIST("Physical Therapist"),
	TEACHER("Teacher"),
	OTHER("Other"),
	SUPERINTENDENT("Superintendent"),
	SCHOOL_NURSE("School Nurse"),
	SPECIALIST_CONSULTANT("Specialist/Consultant"),
	SCHOOL_ADMINISTRATOR("School Administrator"),
	SCHOOL_ADMINISTRATIVE_SUPPORT_STAFF("School Administrative Support Staff"),
	STUDENT_SUPPORT_SERVICES_STAFF("Student Support Services Staff"),
	SCHOOL_LEADER("School Leader"),
	SCHOOL_SPECIALIST("School Specialist"),
	SUBSTITUTE_TEACHER("Substitute Teacher");

	private String prettyName;

	StaffClassificationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
