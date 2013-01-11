package ffm.slc.model.enums;

/**
 * The category of school. For example: High School, Middle School, Elementary School
 */
public enum SchoolCategoryItemType {
	ELEMENTARY_SECONDARY_SCHOOL("Elementary/Secondary School"),
	HIGH_SCHOOL("High School"),
	MIDDLE_SCHOOL("Middle School"),
	JUNIOR_HIGH_SCHOOL("Junior High School"),
	ELEMENTARY_SCHOOL("Elementary School"),
	SECONDARYSCHOOL("SecondarySchool"),
	UNGRADED("Ungraded"),
	ADULT_SCHOOL("Adult School"),
	INFANT_TODDLER_SCHOOL("Infant/toddler School"),
	PRESCHOOL_EARLY_CHILDHOOD("Preschool/early childhood"),
	PRIMARY_SCHOOL("Primary School"),
	INTERMEDIATE_SCHOOL("Intermediate School");

	private String prettyName;

	SchoolCategoryItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
