package ffm.slc.model.enums;

/**
 * The role or type of participation of a student in a discipline incident; for example: Victim, Perpetrator, Witness, Reporter
 */
public enum StudentParticipationCodeType {
	VICTIM("Victim"),
	PERPETRATOR("Perpetrator"),
	WITNESS("Witness"),
	REPORTER("Reporter");

	private String prettyName;

	StudentParticipationCodeType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
