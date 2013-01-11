package ffm.slc.model.enums;

/**
 * The media through which teachers provide instruction to students and students and teachers communicate about instructional matters.
 */
public enum MediumOfInstructionType {
	TELEVISED("Televised"),
	TELEPRESENCE_VIDEO_CONFERENCE("Telepresence/video conference"),
	VIDEOTAPED_PRERECORDED_VIDEO("Videotaped/prerecorded video"),
	OTHER_TECHNOLOGY_BASED_INSTRUCTION("Other technology-based instruction"),
	TECHNOLOGY_BASED_INSTRUCTION_IN_CLASSROOM("Technology-based instruction in classroom"),
	CORRESPONDENCE_INSTRUCTION("Correspondence instruction"),
	FACE_TO_FACE_INSTRUCTION("Face-to-face instruction"),
	VIRTUAL_ON_LINE_DISTANCE_LEARNING("Virtual/On-line Distance learning"),
	CENTER_BASED_INSTRUCTION("Center-based instruction"),
	INDEPENDENT_STUDY("Independent study"),
	INTERNSHIP("Internship"),
	OTHER("Other");

	private String prettyName;

	MediumOfInstructionType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
