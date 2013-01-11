package ffm.slc.model;

import ffm.slc.model.enums.ElectronicMailAddressType;
import ffm.slc.model.resources.ElectronicMailAddress;

public class ElectronicMail {

	private ElectronicMailAddress emailAddress;
	public ElectronicMailAddress getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(ElectronicMailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}
	private ElectronicMailAddressType emailAddressType;
	public ElectronicMailAddressType getEmailAddressType() {
		return emailAddressType;
	}
	public void setEmailAddressType(ElectronicMailAddressType emailAddressType) {
		this.emailAddressType = emailAddressType;
	}
}
