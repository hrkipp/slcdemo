package ffm.slc.actions.newgroup;

import ffm.slc.dispatch.Action;

public class SaveCohort implements Action<SaveCohort.Result> {
    private String name;
    private String description;
    private String successCondition;
    private int startDate;
    private int endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuccessCondition() {
        return successCondition;
    }

    public void setSuccessCondition(String successCondition) {
        this.successCondition = successCondition;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public SaveCohort() {

    }

    public class Result implements ffm.slc.dispatch.Result{

    }
}
