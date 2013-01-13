package ffm.slc.actions.group;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Result;

/**
 * Created with IntelliJ IDEA.
 * User: TJ
 * Date: 1/12/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class SaveStudent implements Action<SaveStudent.Result> {
    private String cohort;
        private String session;
        private String student;
        private String name;
        private int progress;
        private double score;
        private int week;
        private String observation;

    public SaveStudent() {
    }

    public String getCohort() {
        return cohort;
    }

    public String getSession() {
        return session;
    }

    public String getStudent() {
        return student;
    }

    public String getName() {
        return name;
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
