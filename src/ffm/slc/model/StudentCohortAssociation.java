package ffm.slc.model;

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
}
