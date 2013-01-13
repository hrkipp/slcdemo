package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import com.sun.jersey.api.client.ClientResponse;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class StaffCohortAssociation extends Entity {

    private String staffId;
    private String cohortId;
    private Date beginDate;
    private String entityType = "staffCohortAssociation";

    public String getStaff() {
        return staffId;
    }

    public void setStaff(String staff) {
        this.staffId = staff;
    }

    public String getCohort() {
        return cohortId;
    }

    public void setCohort(String cohort) {
        this.cohortId = cohort;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

        public String save(StaffCohortAssociation sca){
            String json = gson.toJson(sca);
            ClientResponse resp = restClient.postRelative("api/rest/v1/staffCohortAssociations",json);
            List<String> locations = resp.getHeaders().get("Location");
            String loc = locations.get(0);
            loc = loc.split("/")[loc.split("/").length-1];
            return loc;
        }


    }


}
