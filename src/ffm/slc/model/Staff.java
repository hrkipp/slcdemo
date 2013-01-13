package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import ffm.slc.model.enums.SexType;
import ffm.slc.model.resources.UniqueStateIdentifier;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.Date;

public class Staff {

	private UniqueStateIdentifier staffUniqueStateId;
	private Name name;
	private SexType sex;
	private Date birthDate;
	private ElectronicMail[] electronicMails;

	public UniqueStateIdentifier getStaffUniqueStateId() {
		return staffUniqueStateId;
	}

	public void setStaffUniqueStateId(UniqueStateIdentifier staffUniqueStateId) {
		this.staffUniqueStateId = staffUniqueStateId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public SexType getSex() {
		return sex;
	}

	public void setSex(SexType sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public ElectronicMail[] getElectronicMails() {
		return electronicMails;
	}

	public void setElectronicMails(ElectronicMail[] electronicMails) {
		this.electronicMails = electronicMails;
	}

	@Singleton
	public static class DAO {

		private final RestClient restClient;
		private final Gson gson;
        private Provider<HttpSession> sessionProvder;

		@Inject
		public DAO(RestClient restClient, Gson gson, Provider<HttpSession> sessionProvder){
			this.restClient = restClient;
			this.gson = gson;
            this.sessionProvder = sessionProvder;
        }

		public Staff getCurrent() {

            Entity home = null;
            if(sessionProvder.get().getAttribute("home") == null){
                home = gson.fromJson(restClient.getRelative("api/rest/v1/home"), Entity.class);
                sessionProvder.get().setAttribute("home", home);
            }
            home = (Entity) sessionProvder.get().getAttribute("home");
            String ret = restClient.get(home.getLink("self"));
			return gson.fromJson(ret, Staff.class);
		}
	}

}


















