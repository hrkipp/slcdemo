package ffm.slc.model.enums;

/**
 * The items of categorization of the circumstances or reason for the restraint.
 */
public enum RestraintEventReasonItemType {
	IMMINENT_SERIOUS_PHYSICAL_HARM_TO_THEMSELVES("Imminent Serious Physical Harm To Themselves"),
	IMMINENT_SERIOUS_PHYSICAL_HARM_TO_OTHERS("Imminent Serious Physical Harm To Others"),
	IMMINENT_SERIOUS_PROPERTY_DESTRUCTION("Imminent Serious Property Destruction");

	private String prettyName;

	RestraintEventReasonItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
