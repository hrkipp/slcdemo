package ffm.slc.model.enums;

/**
 * The description of the content or subject area (e.g., arts, mathematics, reading, stenography, or a foreign language) of an assessment.
 */
public enum AcademicSubjectType {
	ENGLISH_LANGUAGE_AND_LITERATURE("English Language and Literature"),
	ENGLISH("English"),
	ELA("ELA"),
	READING("Reading"),
	MATHEMATICS("Mathematics"),
	LIFE_AND_PHYSICAL_SCIENCES("Life and Physical Sciences"),
	SOCIAL_SCIENCES_AND_HISTORY("Social Sciences and History"),
	SOCIAL_STUDIES("Social Studies"),
	SCIENCE("Science"),
	FINE_AND_PERFORMING_ARTS("Fine and Performing Arts"),
	FOREIGN_LANGUAGE_AND_LITERATURE("Foreign Language and Literature"),
	RELIGIOUS_EDUCATION_AND_THEOLOGY("Religious Education and Theology"),
	PHYSICAL_HEALTH_AND_SAFETY_EDUCATION("Physical, Health, and Safety Education"),
	MILITARY_SCIENCE("Military Science"),
	COMPUTER_AND_INFORMATION_SCIENCES("Computer and Information Sciences"),
	COMMUNICATION_AND_AUDIO_VISUAL_TECHNOLOGY("Communication and Audio/Visual Technology"),
	COMPOSITE("Composite"),
	CRITICAL_READING("Critical Reading"),
	BUSINESS_AND_MARKETING("Business and Marketing"),
	MANUFACTURING("Manufacturing"),
	HEALTH_CARE_SCIENCES("Health Care Sciences"),
	PUBLIC_PROTECTIVE_AND_GOVERNMENT_SERVICE("Public, Protective, and Government Service"),
	HOSPITALITY_AND_TOURISM("Hospitality and Tourism"),
	ARCHITECTURE_AND_CONSTRUCTION("Architecture and Construction"),
	AGRICULTURE_FOOD_AND_NATURAL_RESOURCES("Agriculture, Food, and Natural Resources"),
	HUMAN_SERVICES("Human Services"),
	TRANSPORTATION_DISTRIBUTION_AND_LOGISTICS("Transportation, Distribution and Logistics"),
	ENGINEERING_AND_TECHNOLOGY("Engineering and Technology"),
	WRITING("Writing"),
	MISCELLANEOUS("Miscellaneous"),
	OTHER("Other");

	private String prettyName;

	AcademicSubjectType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
