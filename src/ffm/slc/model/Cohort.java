package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.StringIgnoreCaseKeyComparator;
import ffm.slc.model.enums.CohortType;
import ffm.slc.model.resources.CohortDescription;
import ffm.slc.model.resources.CohortIdentifier;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cohort extends Entity {

    private String cohortIdentifier;
    private String cohortDescription;
    private String educationOrgId;
    transient private Custom custom = new Custom();
//    private String[] staffIds;

    private String cohortType = CohortType.ACADEMIC_INTERVENTION.toString();
    private String entityType = "cohort";

    public Cohort() {
    }

    public String getCohortDescription() {
        return cohortDescription;
    }

    public void setCohortDescription(String cohortDescription) {
        this.cohortDescription = cohortDescription;
    }

    public String getCohortIdentifier() {
        return cohortIdentifier;
    }

    public void setCohortIdentifier(String cohortIdentifier) {
        this.cohortIdentifier = cohortIdentifier;
    }

    public String getEducationOrg() {
        return educationOrgId;
    }

    public void setEducationOrg(String educationOrgId) {
        this.educationOrgId = educationOrgId;
    }

//    public String[] getStaffId() {
////        return staffIds;
//    }

    public void setStaffId(String[] staffId) {
//        this.staffIds = staffId;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

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

        public String save(Cohort cohort) {
            String json = gson.toJson(cohort);
            ClientResponse resp = restClient.postRelative("api/rest/v1/cohorts",json);
            List<String> locations = resp.getHeaders().get("Location");
            String loc = locations.get(0);
            loc = loc.split("/")[loc.split("/").length-1];

            return loc;
        }

        public boolean saveCustom(Custom custom, String cohort){
            ClientResponse resp = restClient.postRelative("api/rest/v1/cohorts/{id}/custom".replace("{id}", cohort), gson.toJson(custom));
            return true;
        }

        public Cohort[] getAll() {

            Entity home = null;
            if(sessionProvder.get().getAttribute("home") == null){
                home = gson.fromJson(restClient.getRelative("api/rest/v1/home"), Entity.class);
                sessionProvder.get().setAttribute("home", home);
            }
            home = (Entity) sessionProvder.get().getAttribute("home");
            String ret = restClient.get(home.getLink("getCohorts"));
            Cohort[] cohorts = gson.fromJson(ret, Cohort[].class);
            for(Cohort c : cohorts){
                c.setCustom(gson.fromJson(restClient.get(c.getLink("custom")), Custom.class));
            }
            return cohorts;
        }

        public Cohort[] getAll(String staff) {

            String ret = restClient.getRelative("api/rest/v1/staff/{id}/staffCohortAssociations/cohorts".replace("{id}", staff));
            Cohort[] cohorts = gson.fromJson(ret, Cohort[].class);
            for(Cohort c : cohorts){
                c.setCustom(gson.fromJson(restClient.get(c.getLink("custom")), Custom.class));
            }
            return cohorts;
        }

        public Cohort get(String id){
            String req = "api/rest/v1/cohorts/{id}".replace("{id}", id);
            Cohort cohort = gson.fromJson(restClient.getRelative(req), Cohort.class);
            cohort.setCustom(gson.fromJson(restClient.get(cohort.getLink("custom")), Custom.class));
            return cohort;
        }

    }

    public static class Custom {
        private String[] learningObjectives;
        private int sessionLength;
        private Date beginDate;

        public String[] getLearningObjectives() {
            return learningObjectives;
        }

        public void setLearningObjectives(String[] learningObjectives) {
            this.learningObjectives = learningObjectives;
        }

        public int getSessionLength() {
            return sessionLength;
        }

        public void setSessionLength(int sessionLength) {
            this.sessionLength = sessionLength;
        }

        public Date getBeginDate() {
            return beginDate;
        }

        public void setBeginDate(Date beginDate) {
            this.beginDate = beginDate;
        }
    }

}
