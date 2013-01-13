package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentCohortAssociation extends Entity {

    private String student;
    private String cohort;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
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

        public String save(StudentCohortAssociation sca){
            return "";
        }


    }

}
