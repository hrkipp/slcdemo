package ffm.slc.model.enums;

/**
 * The setting in which a child receives education and related services.
 */
public enum EducationalEnvironmentType {
	CLASSROOM("Classroom"),
	HOMEBOUND("Homebound"),
	HOSPITAL_CLASS("Hospital class"),
	IN_SCHOOL_SUSPENSION("In-school suspension"),
	LABORATORY("Laboratory"),
	MAINSTREAM_SPECIAL_EDUCATION_("Mainstream (Special Education)"),
	OFF_SCHOOL_CENTER("Off-school center"),
	PULL_OUT_CLASS("Pull-out class"),
	RESOURCE_ROOM("Resource room"),
	SELF_CONTAINED_SPECIAL_EDUCATION_("Self-contained (Special Education)"),
	SELF_STUDY("Self-study"),
	SHOP("Shop");

	private String prettyName;

	EducationalEnvironmentType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
