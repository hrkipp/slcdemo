package ffm.slc.model;


import ffm.slc.model.enums.GenerationCodeSuffixType;
import ffm.slc.model.enums.OtherNameType;
import ffm.slc.model.enums.PersonalTitlePrefixType;
import ffm.slc.model.resources.SimpleName;

public class OtherName {

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
	private OtherNameType otherNameType;
	public OtherNameType getOtherNameType() {
		return otherNameType;
	}
	public void setOtherNameType(OtherNameType otherNameType) {
		this.otherNameType = otherNameType;
	}
}
