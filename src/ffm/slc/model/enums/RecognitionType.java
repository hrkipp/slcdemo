package ffm.slc.model.enums;

/**
 * The nature of recognition given to the student for accomplishments in a co-curricular, or extra-curricular activity.
 */
public enum RecognitionType {
	ATHLETIC_AWARDS("Athletic awards"),
	AWARDING_OF_UNITS_OF_VALUE("Awarding of units of value"),
	CITIZENSHIP_AWARD_RECOGNITION("Citizenship award/recognition"),
	COMPLETION_OF_REQUIREMENT_BUT_NO_UNITS_OF_VALUE_AWARDED("Completion of requirement, but no units of value awarded"),
	CERTIFICATE("Certificate"),
	HONOR_AWARD("Honor award"),
	LETTER_OF_COMMENDATION("Letter of commendation"),
	MEDALS("Medals"),
	MONOGRAM_LETTER("Monogram/letter"),
	POINTS("Points"),
	PROMOTION_OR_ADVANCEMENT("Promotion or advancement"),
	OTHER("Other");

	private String prettyName;

	RecognitionType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
