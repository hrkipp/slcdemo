package ffm.slc.model.enums;

/**
 * Identifies where the incident occurred and whether or not it occurred on school.
 */
public enum IncidentLocationType {
	ON_SCHOOL("On School"),
	ADMINISTRATIVE_OFFICES_AREA("Administrative offices area"),
	CAFETERIA_AREA("Cafeteria area"),
	CLASSROOM("Classroom"),
	HALLWAY_OR_STAIRS("Hallway or stairs"),
	LOCKER_ROOM_OR_GYM_AREAS("Locker room or gym areas"),
	RESTROOM("Restroom"),
	LIBRARY_MEDIA_CENTER("Library/media center"),
	COMPUTER_LAB("Computer lab"),
	AUDITORIUM("Auditorium"),
	ON_SCHOOL_OTHER_INSIDE_AREA("On-School other inside area"),
	ATHLETIC_FIELD_OR_PLAYGROUND("Athletic field or playground"),
	STADIUM("Stadium"),
	PARKING_LOT("Parking lot"),
	ON_SCHOOL_OTHER_OUTSIDE_AREA("On-School other outside area"),
	OFF_SCHOOL("Off School"),
	BUS_STOP("Bus stop"),
	SCHOOL_BUS("School bus"),
	WALKING_TO_OR_FROM_SCHOOL("Walking to or from school"),
	OFF_SCHOOL_AT_OTHER_SCHOOL("Off-School at other school"),
	OFF_SCHOOL_AT_OTHER_SCHOOL_DISTRICT_FACILITY("Off-School at other school district facility"),
	ONLINE("Online"),
	UNKNOWN("Unknown");

	private String prettyName;

	IncidentLocationType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
