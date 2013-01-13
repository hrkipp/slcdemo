package ffm.slc.model;

import com.google.gson.Gson;
import com.google.inject.Provider;
import ffm.slc.rest.RestClient;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 1/12/13
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class StaffCohortAssociation extends Entity {

    private String staff;
    private String cohort;
    private Date beginDate;
    private Date endDate;

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
            return "";
        }


    }


}
