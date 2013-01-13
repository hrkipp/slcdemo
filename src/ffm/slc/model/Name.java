package ffm.slc.model;

import ffm.slc.model.enums.GenerationCodeSuffixType;
import ffm.slc.model.enums.PersonalInformationVerificationType;
import ffm.slc.model.enums.PersonalTitlePrefixType;
import ffm.slc.model.resources.SimpleName;

public class Name {

	private PersonalTitlePrefixType personalTitlePrefix;
	public PersonalTitlePrefixType getPersonalTitlePrefix() {
		return personalTitlePrefix;
	}
	public void setPersonalTitlePrefix(PersonalTitlePrefixType personalTitlePrefix) {
		this.personalTitlePrefix = personalTitlePrefix;
	}
	private SimpleName firstName;
	public SimpleName getFirstName() {
		return firstName;
	}
	public void setFirstName(SimpleName firstName) {
		this.firstName = firstName;
	}
	private SimpleName middleName;
	public SimpleName getMiddleName() {
		return middleName;
	}
	public void setMiddleName(SimpleName middleName) {
		this.middleName = middleName;
	}
	private SimpleName lastSurname;
	public SimpleName getLastSurname() {
		return lastSurname;
	}
	public void setLastSurname(SimpleName lastSurname) {
		this.lastSurname = lastSurname;
	}
	private GenerationCodeSuffixType generationCodeSuffix;
	public GenerationCodeSuffixType getGenerationCodeSuffix() {
		return generationCodeSuffix;
	}
	public void setGenerationCodeSuffix(GenerationCodeSuffixType generationCodeSuffix) {
		this.generationCodeSuffix = generationCodeSuffix;
	}
	private SimpleName maidenName;
	public SimpleName getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(SimpleName maidenName) {
		this.maidenName = maidenName;
	}
	private PersonalInformationVerificationType verification;
	public PersonalInformationVerificationType getVerification() {
		return verification;
	}
	public void setVerification(PersonalInformationVerificationType verification) {
		this.verification = verification;
	}

	public String getFullame() {
		return (personalTitlePrefix!=null?personalTitlePrefix:"")+" "+firstName+" "+lastSurname;
	}
}
