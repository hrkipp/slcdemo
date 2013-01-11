package ffm.slc.model.enums;

/**
 * The abbreviation for the state (within the United States) or outlying area in which an address is located.
 */
public enum StateAbbreviationType {
	AL("AL"),
	AK("AK"),
	AZ("AZ"),
	AR("AR"),
	CA("CA"),
	CO("CO"),
	CT("CT"),
	DC("DC"),
	DE("DE"),
	FL("FL"),
	GA("GA"),
	GU("GU"),
	HI("HI"),
	ID("ID"),
	IL("IL"),
	IN("IN"),
	IA("IA"),
	KS("KS"),
	KY("KY"),
	LA("LA"),
	ME("ME"),
	MD("MD"),
	MA("MA"),
	MI("MI"),
	MN("MN"),
	MS("MS"),
	MO("MO"),
	MT("MT"),
	NE("NE"),
	NV("NV"),
	NH("NH"),
	NJ("NJ"),
	NM("NM"),
	NY("NY"),
	NC("NC"),
	ND("ND"),
	OH("OH"),
	OK("OK"),
	OR("OR"),
	PA("PA"),
	PR("PR"),
	RI("RI"),
	SC("SC"),
	SD("SD"),
	TN("TN"),
	TX("TX"),
	UT("UT"),
	VT("VT"),
	VA("VA"),
	WA("WA"),
	WV("WV"),
	WI("WI"),
	WY("WY");

	private String prettyName;

	StateAbbreviationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
