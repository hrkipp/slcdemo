package ffm.slc.model.enums;

/**
 * The career cluster or pathway representing the career path of the Vocational/Career Tech concentrator.
 */
public enum CareerPathwayType {
	AGRICULTURE_FOOD_AND_NATURAL_RESOURCES("Agriculture, Food and Natural Resources"),
	ARCHITECTURE_AND_CONSTRUCTION("Architecture and Construction"),
	ARTS_A_V_TECHNOLOGY_AND_COMMUNICATIONS("Arts, A/V Technology and Communications"),
	BUSINESS_MANAGEMENT_AND_ADMINISTRATION("Business, Management and Administration"),
	EDUCATION_AND_TRAINING("Education and Training"),
	FINANCE("Finance"),
	GOVERNMENT_AND_PUBLIC_ADMINISTRATION("Government and Public Administration"),
	HEALTH_SCIENCE("Health Science"),
	HOSPITALITY_AND_TOURISM("Hospitality and Tourism"),
	HUMAN_SERVICES("Human Services"),
	INFORMATION_TECHNOLOGY("Information Technology"),
	LAW_PUBLIC_SAFETY_CORRECTIONS_AND_SECURITY("Law, Public Safety, Corrections and Security"),
	MANUFACTURING("Manufacturing"),
	MARKETING_SALES_AND_SERVICE("Marketing, Sales and Service"),
	SCIENCE_TECHNOLOGY_ENGINEERING_AND_MATHEMATICS("Science, Technology, Engineering and Mathematics"),
	TRANSPORTATION_DISTRIBUTION_AND_LOGISTICS("Transportation, Distribution and Logistics");

	private String prettyName;

	CareerPathwayType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
