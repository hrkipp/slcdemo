package ffm.slc.model.enums;

/**
 * The enumeration items for the types of weapon used during an incident.
 */
public enum WeaponItemType {
	FIREARM("Firearm"),
	ILLEGAL_KNIFE("Illegal Knife"),
	NON_ILLEGAL_KNIFE("Non-Illegal Knife"),
	CLUB("Club"),
	OTHER_SHARP_OBJECTS("Other Sharp Objects"),
	OTHER_OBJECT("Other Object"),
	SUBSTANCE_USED_AS_WEAPON("Substance Used as Weapon"),
	KNIFE("Knife"),
	UNKNOWN("Unknown"),
	NONE("None"),
	OTHER("Other");

	private String prettyName;

	WeaponItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
