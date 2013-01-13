package ffm.slc.actions.newgroup;

import ffm.slc.dispatch.Action;
import ffm.slc.dispatch.Handler;
import ffm.slc.handlers.newgroup.SaveCohortActionHandler;

@Handler(SaveCohortActionHandler.class)
public class SaveCohort implements Action<SaveCohort.Result> {
    private String name;
    private String description;
    private String successCondition;
    private long startDate;
    private int numOfWeeks;
    private String[] students;
    private String[] learningObjectives;

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

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public long getStartDate() {
        return startDate;
    }

    public int getNumOfWeeks() {
        return numOfWeeks;
    }

    public void setNumOfWeeks(int numOfWeeks) {
        this.numOfWeeks = numOfWeeks;
    }

    public String[] getLearningObjectives() {
        return learningObjectives;
    }

    public void setLearningObjectives(String[] learningObjectives) {
        this.learningObjectives = learningObjectives;
    }

    public static class Result implements ffm.slc.dispatch.Result{

    }
}
