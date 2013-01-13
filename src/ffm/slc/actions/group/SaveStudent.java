package ffm.slc.actions.group;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Handler;
import ffm.slc.dispatch.Result;
import ffm.slc.handlers.group.SaveStudentActionHandler;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
@Handler(SaveStudentActionHandler.class)
public class SaveStudent implements Action<SaveStudent.Result> {
    private String cohort;
    private String student;
    private int progress;
    private double score;
    private int week;
    private String observation;

    public SaveStudent() {
    }

    public String getCohort() {
        return cohort;
    }


    public String getStudent() {
        return student;
    }

    public int getProgress() {
        return progress;
    }

    public double getScore() {
        return score;
    }

    public String getObservation() {
        return observation;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public static class Result implements ffm.slc.dispatch.Result{

    }
}
