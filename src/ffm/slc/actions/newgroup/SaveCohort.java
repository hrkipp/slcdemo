package ffm.slc.actions.newgroup;

import ffm.slc.dispatch.Action;

public class SaveCohort implements Action {
    private String name;
    private String description;
    private String successCondition;
    private int startDate;
    private int endDate;

    public class Result implements ffm.slc.dispatch.Result{

    }
}
