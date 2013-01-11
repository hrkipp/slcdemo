package ffm.slc.model.enums;

/**
 * The type of diploma/credential that is awarded to a student in recognition of his/her completion of the curricular requirements..
 */
public enum DiplomaType {
	REGULAR_DIPLOMA("Regular diploma"),
	ENDORSED_ADVANCED_DIPLOMA("Endorsed/advanced diploma"),
	REGENTS_DIPLOMA("Regents diploma"),
	INTERNATIONAL_BACCALAUREATE("International Baccalaureate"),
	MODIFIED_DIPLOMA("Modified diploma"),
	OTHER_DIPLOMA("Other diploma"),
	ALTERNATIVE_CREDENTIAL("Alternative credential"),
	CERTIFICATE_OF_ATTENDANCE("Certificate of attendance"),
	CERTIFICATE_OF_COMPLETION("Certificate of completion"),
	HIGH_SCHOOL_EQUIVALENCY_CREDENTIAL_OTHER_THAN_GED("High school equivalency credential, other than GED"),
	GENERAL_EDUCATIONAL_DEVELOPMENT_GED_CREDENTIAL("General Educational Development (GED) credential"),
	POST_GRADUATE_CERTIFICATE_GRADE_13_("Post graduate certificate (grade 13)"),
	VOCATIONAL_CERTIFICATE("Vocational certificate"),
	OTHER("Other");

	private String prettyName;

	DiplomaType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
