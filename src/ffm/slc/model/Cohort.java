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

        public Cohort[] getAll() {

                Entity home = null;
                if(sessionProvder.get().getAttribute("home") == null){
                    home = gson.fromJson(restClient.getRelative("api/rest/v1/home"), Entity.class);
                    sessionProvder.get().setAttribute("home", home);
                }
                home = (Entity) sessionProvder.get().getAttribute("home");
                String ret = restClient.get(home.getLink("getCohorts"));
                return gson.fromJson(ret, Cohort[].class);
        }

        public Cohort[] getAll(String staff) {

            String ret = restClient.getRelative("api/rest/v1/staff/{id}/staffCohortAssociations/cohorts".replace("{id}", staff));
            return gson.fromJson(ret, Cohort[].class);
        }
    }

}
