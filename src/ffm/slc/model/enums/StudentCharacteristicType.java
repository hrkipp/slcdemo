package ffm.slc.model.enums;

/**
 * Enumeration items for the important characteristics of the student's home situation: Displaced Homemaker, Homeless, Immigrant, Migratory, Military Parent, Pregnant Teen, Single Parent, Unaccompanied Youth
 */
public enum StudentCharacteristicType {
	DISPLACED_HOMEMAKER("Displaced Homemaker"),
	FOSTER_CARE("Foster Care"),
	HOMELESS("Homeless"),
	IMMIGRANT("Immigrant"),
	MIGRATORY("Migratory"),
	PARENT_IN_MILITARY("Parent in Military"),
	PREGNANT("Pregnant"),
	SINGLE_PARENT("Single Parent"),
	UNACCOMPANIED_YOUTH("Unaccompanied Youth"),
	UNSCHOOLED_ASYLEE("Unschooled Asylee"),
	UNSCHOOLED_REFUGEE("Unschooled Refugee");

	private String prettyName;

	StudentCharacteristicType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
