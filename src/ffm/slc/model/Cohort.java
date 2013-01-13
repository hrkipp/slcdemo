package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import com.sun.jersey.api.client.ClientResponse;
import ffm.slc.model.resources.CohortDescription;
import ffm.slc.model.resources.CohortIdentifier;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
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

            ClientResponse resp = restClient.postRelative("api/rest/v1/cohorts", gson.toJson(cohort));
           List<String> locations = resp.getHeaders().get("Location");
            System.out.println(locations);
            return null;
        }
    }

}
