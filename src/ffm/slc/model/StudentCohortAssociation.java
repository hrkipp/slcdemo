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
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentCohortAssociation extends Entity {

    private String studentId;
    private Date beginDate;
    private String cohortId;
    private String entityType = "studentCohortAssociation";
    transient private Custom custom = new Custom();

    public String getStudentid() {
        return studentId;
    }

    public void setStudentid(String studentid) {
        this.studentId = studentid;
    }

    public String getCohortId() {
        return cohortId;
    }

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
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

        public String save(StudentCohortAssociation sca){
            String json = gson.toJson(sca);
            ClientResponse resp = restClient.postRelative("api/rest/v1/studentCohortAssociations",json);
            List<String> locations = resp.getHeaders().get("Location");
            String loc = locations.get(0);
            loc = loc.split("/")[loc.split("/").length-1];
            List<String> cusom = restClient.post(locations.get(0)+"/custom", gson.toJson(sca.getCustom())).getHeaders().get("Location");
            System.out.println(cusom);
            return loc;
        }


        public StudentCohortAssociation get(String student, String cohort) {
            String req = "api/rest/v1/cohorts/{id1}/studentCohortAssociations/?studentId={id2}";
            req = req.replace("{id1", cohort).replace("{id2}", student);
            StudentCohortAssociation sca = gson.fromJson(restClient.getRelative(req), StudentCohortAssociation.class);
            sca.setCustom(gson.fromJson(restClient.get(sca.getLink("custom")), Custom.class));
            return gson.fromJson(restClient.getRelative(req), StudentCohortAssociation.class);
        }

        public StudentCohortAssociation[]  getAll(Cohort cohort){
            String req = "api/rest/v1/cohorts/{id}/studentCohortAssociations".replace("{id}", cohort.getId().getValue());
            StudentCohortAssociation[] scas = gson.fromJson(restClient.getRelative(req), StudentCohortAssociation[].class);
            for(StudentCohortAssociation c : scas){
                c.setCustom(gson.fromJson(restClient.get(c.getLink("custom")), Custom.class));
            }
            return gson.fromJson(restClient.getRelative(req), StudentCohortAssociation[].class);
        }

        public void saveCustom(Custom custom, String cohort) {
            ClientResponse resp = restClient.postRelative("api/rest/v1/studentCohortAssociation/{id}/custom".replace("{id}", cohort), gson.toJson(custom));
        }
    }

    public static class Custom {
        private String[] notes;
        private int[] progress;
        private Double[] score;

        public String[] getNotes() {
            return notes;
        }

        public void setNotes(String[] notes) {
            this.notes = notes;
        }


        public int[] getProgress() {
            return progress;
        }

        public void setProgress(int[] progress) {
            this.progress = progress;
        }

        public Double[] getScore() {
            return score;
        }

        public void setScore(Double[] score) {
            this.score = score;
        }
    }

}
