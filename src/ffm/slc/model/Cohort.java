package ffm.slc.model;

import ffm.slc.model.resources.CohortDescription;
import ffm.slc.model.resources.CohortIdentifier;

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
}
